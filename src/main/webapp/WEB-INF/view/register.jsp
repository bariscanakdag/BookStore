<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="tr">

<head>
    <!-- Required meta tags-->
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta name="description" content="Colorlib Templates">
    <meta name="author" content="Colorlib">
    <meta name="keywords" content="Colorlib Templates">


    <title>${title}</title>

    <!-- Icons font CSS-->
    <link href="/appdata/vendor/mdi-font/css/material-design-iconic-font.min.css" rel="stylesheet" media="all">
    <link href="/appdata/vendor/font-awesome-4.7/css/font-awesome.min.css" rel="stylesheet" media="all">
    <!-- Font special for pages-->
    <link href="https://fonts.googleapis.com/css?family=Poppins:100,100i,200,200i,300,300i,400,400i,500,500i,600,600i,700,700i,800,800i,900,900i" rel="stylesheet">

    <!-- Vendor CSS-->
    <link href="/appdata/vendor/select2/select2.min.css" rel="stylesheet" media="all">
    <link href="/appdata/vendor/datepicker/daterangepicker.css" rel="stylesheet" media="all">

    <!-- Main CSS-->
    <link href="/appdata/css/register.css" rel="stylesheet" media="all">
</head>

<body>
<div class="page-wrapper bg-gra-02 p-t-130 p-b-100 font-poppins">
    <div class="wrapper wrapper--w680">
        <div class="card card-4">
            <div class="card-body">
                <h2 class="title">Kayıt Formu</h2>
                <form:form modelAttribute="register" action="/auth/register" method="post">
                    <div class="row row-space">
                        <div class="col-2">
                            <div class="input-group">
                                <label class="label">Kullanıcı</label>
                                <form:input cssClass="input--style-4" path="userName"/>
                            </div>
                            <div class="col-2">
                                <div class="input-group">
                                    <label class="label">Şifre</label>
                                    <form:password cssClass="input--style-4" path="password"/>
                                </div>
                            </div>
                        </div>
                    </div>

                    <div class="row row-space">
                        <div class="col-2">
                            <div class="input-group">
                                <label class="label">Email</label>
                                <form:input cssClass="input--style-4" path="email" />
                            </div>
                        </div>
                        <div class="col-2">
                            <div class="input-group">
                                <label class="label">Telefon </label>
                                <form:input cssClass="input--style-4" path="phoneNumber" />
                            </div>
                        </div>
                    </div>

                    <div class="p-t-15">
                        <button class="btn btn--radius-2 btn--blue" type="submit">Kayıt Ol</button>
                    </div>
                </form:form>
            </div>
        </div>
    </div>
</div>

<!-- Jquery JS-->
<script src="/appdata/vendor/jquery/jquery.min.js"></script>
<!-- Vendor JS-->
<script src="/appdata/vendor/select2/select2.min.js"></script>
<script src="/appdata/vendor/datepicker/moment.min.js"></script>
<script src="/appdata/vendor/datepicker/daterangepicker.js"></script>

<!-- Main JS-->
<script src="/appdata/js/global.js"></script>

</body><!-- This templates was made by Colorlib (https://colorlib.com) -->

</html>
<!-- end document-->