
<jsp:useBean id="p" class="dao.impl.ProductDAOImpl" scope="request"></jsp:useBean>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<div class="col-sm-3" style="margin-top: 10px;">
    <div class="card bg-light sm-2">
        <div class="card-header bg-primary text-white text-uppercase"><i class="fa fa-list"></i> Categories</div>
        <ul class="list-group category_block">
            <c:forEach items="${p.allCate}" var="e">
                <li class="list-group-item text-white"><a href="filterCate?cid=${e.cateID}">${e.getCateName()}</a></li>
            </c:forEach>
        </ul>
    </div>
</div>