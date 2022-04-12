
<div class="col-md-3">
	<p class="lead">Shop Name</p>
	<div class="list-group">
		<c:forEach items="${categories}" var="category">
			<a href="${contextRoot}/product/view/category/${category.id}/products" class="list-group-item">${category.name}</a>
		</c:forEach>
	</div>
</div>