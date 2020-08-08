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
<div class="container">
    <section>
        <h1 class="text-center text-grey">Covid-19 Tracker</h1>
        <hr>
        <div class="row">
            <div class="col-sm">
                <div class="card" style="width: 18rem; height: 25rem;">
                    <img  height="150" src="https://image.freepik.com/free-vector/checking-body-temperature-concept_23-2148520721.jpg"
                         class="card-img-top" alt="Confirmed">
                    <div class="card-body">
                        <h5 class="card-title">Confirmed</h5>
                        <p class="card-text"><h6> Number of active cases of COVID-19</h6><br>
                        <h6>${globalData.confirmed}</h6><br>
                        May all infected people heal up soon..
                        </p>
                    </div>
                </div>
            </div>
            <div class="col-sm">
                <div class="card" style="width: 18rem;height: 25rem;">
                    <img  height="150" src="https://image.freepik.com/free-vector/fight-virus-concept_23-2148497386.jpg"
                         class="card-img-top" alt="Recoverd">
                    <div class="card-body">
                        <h5 class="card-title">Recoverd</h5>
                        <p class="card-text">
                            Number of recoveries from COVID-19<br>
                        <h6>${globalData.recovered}</h6><br>May you all never catch it again</p>
                    </div>
                </div>
            </div>
            <div class="col-sm">
                <div class="card" style="width: 18rem;height: 25rem;">
                    <img  height="150" src="https://image.freepik.com/free-vector/stop-coronavirus-bacteria-trapped_23-2148503861.jpg"
                         class="card-img-top" alt="...">
                    <div class="card-body">
                        <h5 class="card-title">Death</h5>
                        <p class="card-text">Number of deaths by COVID-19<br>
                        <h6>${globalData.death}</h6>
                        <br>May their soul rest in peace</p>

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
                        <option selected>Choose Country...</option>
                        <c:forEach items="${listCountry}" var="contry">
                            <option value="${contry.key}">${contry.value}</option>
                        </c:forEach>
                    </select>
                </div>
                <div class="col-auto my-1">
                    <button type="submit" class="btn btn-primary">Submit</button>
                </div>
            </div>
        </form:form>
        <c:if test="${!empty confirmed}">
            <!-- details table -->
            <div class="table-responsive-lg">
                <table class="table">
                    <caption>Country Details </caption>
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
        </c:if>
    </section>
</div><!--container ends -->
</body>
</html>