<!DOCTYPE html>
<html lang="en">
<head>
  <title>Bootstrap </title>
  <link rel="stylesheet" href="/vendor/bootstrap/css/bootstrap.min.css">

<!-- FormValidation CSS file -->
<link rel="stylesheet" href="/vendor/formvalidation/dist/css/formValidation.min.css">

<!-- jQuery v1.9.1 or higher -->
<script type="text/javascript" src="/vendor/jquery/jquery.min.js"></script>

<!-- Bootstrap JS -->
<script src="/vendor/bootstrap/js/bootstrap.min.js"></script>

<!-- FormValidation plugin and the class supports validating Bootstrap form -->
<script src="/vendor/formvalidation/dist/js/formValidation.min.js"></script>
<script src="/vendor/formvalidation/dist/js/framework/bootstrap.min.js"></script>

  
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
  <link href="http://fonts.googleapis.com/css?family=Lato" rel="stylesheet" type="text/css">
  <link href="http://fonts.googleapis.com/css?family=Montserrat" rel="stylesheet" type="text/css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.2/jquery.min.js"></script>
  <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>
<form id="signinForm">
    <div class="form-group">
        <input type="text" class="form-control" name="username" placeholder="Username" />
    </div>

    <div class="form-group">
        <input type="password" class="form-control" name="password" placeholder="Password" />
    </div>

    <!-- Do NOT use name="submit" or id="submit" for the Submit button -->
    <button type="submit" class="btn btn-default">Sign in</button>
</form>

<script>
$(document).ready(function() {
    $('#signinForm').formValidation({
        framework: 'bootstrap',
        icon: {
            valid: 'glyphicon glyphicon-ok',
            invalid: 'glyphicon glyphicon-remove',
            validating: 'glyphicon glyphicon-refresh'
        },
        fields: {
            username: {
                validators: {
                    notEmpty: {
                        message: 'The username is required'
                    },
                    stringLength: {
                        min: 6,
                        max: 30,
                        message: 'The username must be more than 6 and less than 30 characters long'
                    },
                    regexp: {
                        regexp: /^[a-zA-Z0-9_]+$/,
                        message: 'The username can only consist of alphabetical, number and underscore'
                    }
                }
            },
            password: {
                validators: {
                    notEmpty: {
                        message: 'The password is required'
                    }
                }
            }
        }
    });
});
</script>

