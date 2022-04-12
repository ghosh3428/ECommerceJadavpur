<div class="container">

	<div class="row">

		<%@include file="./shared/sidemenu.jsp"%>

		<div class="col-md-9">

			<div class="row">
				<div class="col-lg-12">
				
				<c:if test="${userclickallproducts == true}" var="i">
					<ol class="breadcrumb">
						<li class="breadcrumb-item"><a href="#">Home</a></li>
						<li class="breadcrumb-item active">All Products</li>
					</ol>
				</div>
				</c:if>
				
				<c:if test="${userclickcategoryproducts == true}" var="i">
					<ol class="breadcrumb">
						<li class="breadcrumb-item"><a href="#">Home</a></li>
						<li class="breadcrumb-item active">Category</li>
						<li class="breadcrumb-item active">${category.name}</li>
					</ol>
				</div>
				</c:if>

			</div>


			<div class="col-sm-12">

				<table id="productTable" class="table table-striped table-hover">

					<thead>
						<tr>
							<th></th>
							<th>NAME</th>
							<th>BRAND</th>
							<th>UNIT PRICE</th>
							<th>AVAILABLE QUANTITY</th>
							<th></th>
						</tr>
					</thead>
					<tfoot>
						<tr>
							<th></th>
							<th>NAME</th>
							<th>BRAND</th>
							<th>UNIT PRICE</th>
							<th>AVAILABLE QUANTITY</th>
							<th></th>
						</tr>
					</tfoot>

				</table>
			</div>
		</div>



	</div>

</div>



