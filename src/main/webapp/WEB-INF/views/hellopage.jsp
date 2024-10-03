<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Hello Page</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet"
    integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
  <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.11.3/font/bootstrap-icons.min.css">
</head>
<body>
	<h1>Hello from the app!!!</h1>
	<body>
  <!-- registration form -->
  <!-- form-control, form-label, form-select, input-group, input-group-text -->
  <section id="register">
    <div class="container-lg">
      <div class="text-center mt-5">
        <h2>User Registration Form</h2>
        <p class="lead">Fill in this form and click register...</p>
      </div>
      <!-- actual registration form -->
      <div class="container-lg my-5">
        <div class="row justify-content-center my-5">
          <div class="col-lg-6">
            <form action="" method="post">
              <!-- Email -->
              <label for="email" class="form-label">Email address: </label>
              <div class="input-group mb-4">
                <span class="input-group-text">
                  <i class="bi bi-envelope-fill text-secondary"></i>
                </span>
                <input type="email" class="form-control" name="email" id="email"
                  placeholder="e.g. mario@example.col-sm-4" required>
              </div>
              <!-- Name -->
              <label for="name" class="form-label">Name: </label>
              <div class="input-group mb-4">
                <span class="input-group-text">
                  <i class="bi bi-person-fill"></i>
                </span>
                <input type="text" class="form-control" name="name" id="name" placeholder="e.g. Mario" required>
              </div>
              <!-- Password -->
              <label for="password" class="form-label">Password</label>
              <div class="input-group mb-4">
                <span class="input-group-text">
                  <i class="bi bi-key"></i>
                </span>
                <input type="password" name="password" class="form-control" id="password" placeholder="A@U!€m$8!wt%"
                  required>
              </div>

              <!-- <div class="form-floating mb-4 mt-5">
                <textarea name="query" id="query" class="form-control" style="height: 140px"></textarea>
                <label for="query">Your query...</label>
              </div> -->

              <div class="mb-4 text-center">
                <button type="submit" class="btn btn-secondary">Register</button>
              </div>
              <!-- <label for="query" class="form-label">Your query...</label> -->
              <!-- <textarea name="query" id="query" class="form-control" cols="30" rows="10"></textarea> -->
              <!-- <textarea name="query" id="query" class="form-control" style="height: 140px"></textarea> -->
            </form>
          </div>
        </div>
      </div>
      <!-- actual contact form ends -->
    </div>
  </section>

  <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"
    integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz"
    crossorigin="anonymous"></script>
</body>
</body>
</html>