<%--
  Created by IntelliJ IDEA.
  User: Lenovo
  Date: 05-08-2020
  Time: 18:10
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Covid-19 Tracker</title>
    <meta charset="UTF-8">
    <meta content="width=device-width, initial-scale=1.0" name="viewport">
    <link rel="icon" href="https://image.flaticon.com/icons/svg/2904/2904311.svg" type="image/x-icon">
    <!-- CSS only -->
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css"
          integrity="sha384-JcKb8q3iqJ61gNV9KGb8thSsNjpSL0n8PARn9HuZOnIxN0hoP+VmmDGMN5t9UJ0Z" crossorigin="anonymous">

    <!-- JS, Popper.js, and jQuery -->
    <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"
            integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj"
            crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js"
            integrity="sha384-9/reFTGAW83EW2RDu2S0VKaIzap3H66lZH81PoYlFhbGU+6BZp6G7niu735Sk7lN"
            crossorigin="anonymous"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"
            integrity="sha384-B4gt1jrGC7Jh4AgTPSdUtOBvfO8shuf57BaghqFfPlYxofvL8/KUEfYiJOMMV+rV"
            crossorigin="anonymous"></script>
</head>
<body>
<div class="container-fluid">
    <section id="navbaar">
        <div>
            <nav class="navbar fixed-top navbar-light bg-light">
                <a class="navbar-brand" href="#">
                    <img src="https://image.flaticon.com/icons/svg/2904/2904311.svg"
                         width="30" height="30" class="d-inline-block align-top" alt="Logo" loading="lazy">
                    Covid-19 Tracker
                </a>
            </nav>
        </div>
    </section>
</div>
<br>
<hr>
<div class="container">
    <section>
        <hr>
        <div class="row">
            <div class="col-sm">
                <div class="card" style="width: 18rem; height: 25rem;">
                    <img height="200"
                         src="https://image.freepik.com/free-vector/checking-body-temperature-concept_23-2148520721.jpg"
                         class="card-img-top" alt="Confirmed">
                    <div class="card-body">
                        <h5 class="card-title"> Globaly Confirmed Cases</h5>
                        <p class="card text-center">
                        <h6 class="text-center"> Number of active cases of COVID-19</h6>
                        <h6 class="text-center">${globalData.confirmed}
                        <br>May all infected people heal up soon..</h6>
                        </p>
                    </div>
                </div>
            </div>
            <div class="col-sm">
                <div class="card" style="width: 18rem;height: 25rem;">

                    <img height="200"
                         src="https://image.freepik.com/free-vector/person-fighting-virus-illustrated_52683-35833.jpg"
                         class="card-img-top" alt="Recoverd">
                    <div class="card-body">
                        <h5 class="card-title">Globaly Recoverd Cases</h5>
                        <p class="card text-center">
                        <h6 class="text-center">Number of recoveries from COVID-19</h6>
                        <h6 class="text-center">${globalData.recovered}
                            <br>May you all never catch it again.. </h6></p>
                    </div>
                </div>
            </div>
            <div class="col-sm">
                <div class="card" style="width: 18rem;height: 25rem;">
                    <img height="200"
                         src="https://image.freepik.com/free-vector/stop-coronavirus-bacteria-trapped_23-2148503861.jpg"
                         class="card-img-top" alt="...">
                    <div class="card-body">
                        <h5 class="card-title">Global Death Cases</h5>
                        <p class="card text-center">
                        <h6 class="text-center">Number of deaths by COVID-19</h6>
                        <h6 class="text-center">${globalData.death}
                            <br>May their soul rest in peace .. </h6> </p>

                    </div>
                </div>
            </div>
        </div><!-- row ends -->
    </section>
    <hr>

    <section>
        <form:form modelAttribute="listCountry" action="home" method="get">
        <div class="form-row align-items-center">
            <div class="col-auto my-1">
                <label class="mr-sm-2 sr-only" for="inlineFormCustomSelect">Country</label>
                <select class="custom-select mr-sm-2" id="inlineFormCustomSelect" name="name">
                    <option>Choose Country...</option>
                    <c:forEach items="${listCountry}" var="contry">
                        <option value="${contry.key}">${contry.value}</option>
                    </c:forEach>
                </select>
            </div>
            <div class="col-auto my-1">
                <button type="submit" class="btn btn-primary">Submit</button>
                <span>
                    <%--<c:if test="${!empty errorMsg}">--%>
                    <p>${errorMsg}</p>
                   <%-- </c:if>--%>
                </span>
            </div>
        </div>
        </form:form>

        <hr>

        <div class="row"><!-- row starts -->
            <c:if test="${!empty confirmed}">
            <div class="col-lg">
                <div class="card text-white bg-secondary mb-3" style="max-width: 18rem;">
                    <div class="card-header"> Confirmed</div>
                    <div class="card-body">
                        <h5 class="card-title">Total COnfirmed Cases </h5>
                        <p class="card-text">${conNum}</p>
                    </div>
                </div>
            </div>

            <div class="col-lg">
                <div class="card text-white bg-success mb-3" style="max-width: 18rem;">
                    <div class="card-header">Recoverd</div>
                    <div class="card-body">
                        <h5 class="card-title">Total Recoverd Cases</h5>
                        <p class="card-text">${recNo}</p>
                    </div>
                </div>
            </div>

            <div class="col-lg">
                <div class="card text-white bg-danger mb-3" style="max-width: 18rem;">
                    <div class="card-header">Deaths</div>
                    <div class="card-body">
                        <h5 class="card-title">Total Deaths</h5>
                        <p class="card-text">${deathNo}</p>
                    </div>
                </div>
            </div>
        </div>
        <!--row ends -->
        </c:if>

        <div class="row">
            <div class="col-lg">
                <c:if test="${!empty confirmed}">

                    <div class="accordion" id="accordionExample">
                        <div class="card">
                            <div class="card-header" id="headingOne">
                                <h2 class="mb-0">
                                    <button class="btn btn-link btn-block text-left" type="button"
                                            data-toggle="collapse" data-target="#collapseOne" aria-expanded="true"
                                            aria-controls="collapseOne">
                                        More Details
                                    </button>
                                </h2>
                            </div>

                            <div id="collapseOne" class="collapse show" aria-labelledby="headingOne"
                                 data-parent="#accordionExample">
                                <div class="card-body">
                                    <div class="table-responsive-lg">
                                        <!-- details table -->
                                        <table class="table">
                                            <caption>Country Details</caption>
                                            <thead>
                                            <tr>
                                                <th scope="col">ProvinceState</th>
                                                <th scope="col">CountryRegion</th>
                                                <th scope="col">Confirmed</th>
                                                <th scope="col">Recovered</th>
                                                <th scope="col">Deaths</th>
                                                <th scope="col">Active</th>
                                                <th scope="col">Last Updated</th>
                                            </tr>
                                            </thead>
                                            <tbody>
                                            <c:forEach items="${confirmed}" var="item">
                                                <tr>
                                                    <td>${item.provinceState}</td>
                                                    <td>${item.countryRegion}</td>
                                                    <td>${item.confirmed}</td>
                                                    <td>${item.recovered}</td>
                                                    <td>${item.deaths}</td>
                                                    <td>${item.active}</td>
                                                    <td>${globalData.lastUpdated}</td>

                                                </tr>
                                            </c:forEach>
                                            </tbody>
                                        </table>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </c:if>
            </div>
        </div>
</div>
</section>
</div><!--container ends -->
</body>
</html>