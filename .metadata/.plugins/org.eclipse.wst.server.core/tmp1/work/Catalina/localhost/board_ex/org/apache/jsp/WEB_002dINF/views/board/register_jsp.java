/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.58
 * Generated at: 2022-07-13 02:45:29 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views.board;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class register_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(7);
    _jspx_dependants.put("jar:file:/C:/Users/s/eclipse-workspace03/.metadata/.plugins/org.eclipse.wst.server.core/tmp1/wtpwebapps/board_ex/WEB-INF/lib/jstl-1.2.jar!/META-INF/c.tld", Long.valueOf(1153352682000L));
    _jspx_dependants.put("/WEB-INF/views/layout/header.jspf", Long.valueOf(1657673184854L));
    _jspx_dependants.put("jar:file:/C:/Users/s/eclipse-workspace03/.metadata/.plugins/org.eclipse.wst.server.core/tmp1/wtpwebapps/board_ex/WEB-INF/lib/jstl-1.2.jar!/META-INF/fmt.tld", Long.valueOf(1153352682000L));
    _jspx_dependants.put("/WEB-INF/lib/jstl-1.2.jar", Long.valueOf(1653880175862L));
    _jspx_dependants.put("jar:file:/C:/Users/s/eclipse-workspace03/.metadata/.plugins/org.eclipse.wst.server.core/tmp1/wtpwebapps/board_ex/WEB-INF/lib/spring-security-taglibs-5.1.5.RELEASE.jar!/META-INF/security.tld", Long.valueOf(1553617530000L));
    _jspx_dependants.put("/WEB-INF/views/layout/footer.jspf", Long.valueOf(1657154995837L));
    _jspx_dependants.put("/WEB-INF/lib/spring-security-taglibs-5.1.5.RELEASE.jar", Long.valueOf(1657076767702L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fsec_005fauthentication_0026_005fvar_005fproperty_005fnobody;

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fsec_005fauthentication_0026_005fvar_005fproperty_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.release();
    _005fjspx_005ftagPool_005fsec_005fauthentication_0026_005fvar_005fproperty_005fnobody.release();
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSP들은 오직 GET, POST 또는 HEAD 메소드만을 허용합니다. Jasper는 OPTIONS 메소드 또한 허용합니다.");
        return;
      }
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write('\r');
      out.write('\n');
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      if (_jspx_meth_c_005fset_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("<link rel=\"stylesheet\" href=\"https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/css/bootstrap.min.css\">\r\n");
      out.write("<script src=\"https://cdnjs.cloudflare.com/ajax/libs/jquery/3.6.0/jquery.min.js\" referrerpolicy=\"no-referrer\"></script>\r\n");
      out.write("<script src=\"https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js\"></script>\r\n");
      out.write("<script src=\"https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/js/bootstrap.bundle.min.js\"></script>\r\n");
      out.write("<script>\r\n");
      out.write("	let contextPath = '");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("'\r\n");
      out.write("	let csrfHeaderName = \"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${_csrf.headerName}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\"\r\n");
      out.write("	let csrfTokenName = \"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${_csrf.token}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\"\r\n");
      out.write("	console.log(csrfHeaderName)\r\n");
      out.write("	console.log(csrfTokenName)\r\n");
      out.write("</script>\r\n");
      out.write("<script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/resources/js/Reply.js\"></script>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<nav class=\"navbar navbar-expand-sm bg-dark navbar-dark\">\r\n");
      out.write("  <a class=\"navbar-brand\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\">Logo</a>\r\n");
      out.write("\r\n");
      out.write("  <ul class=\"navbar-nav\">\r\n");
      out.write("    <li class=\"nav-item\">\r\n");
      out.write("      <a class=\"nav-link\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/board/list\">게시판</a>\r\n");
      out.write("    </li>\r\n");
      out.write("    <li class=\"nav-item\">\r\n");
      out.write("      <a class=\"nav-link\" href=\"#\">오지마셈</a>\r\n");
      out.write("    </li>\r\n");
      out.write("\r\n");
      out.write("    <li class=\"nav-item dropdown\">\r\n");
      out.write("      <a class=\"nav-link dropdown-toggle\" href=\"#\" id=\"navbardrop\" data-toggle=\"dropdown\">\r\n");
      out.write("        Dropdown link\r\n");
      out.write("      </a>\r\n");
      out.write("      <div class=\"dropdown-menu\">\r\n");
      out.write("        <a class=\"dropdown-item\" href=\"#\">Link 1</a>\r\n");
      out.write("        <a class=\"dropdown-item\" href=\"#\">Link 2</a>\r\n");
      out.write("        <a class=\"dropdown-item\" href=\"#\">Link 3</a>\r\n");
      out.write("      </div>\r\n");
      out.write("    </li>\r\n");
      out.write("  </ul>\r\n");
      out.write("</nav>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
      out.write('\r');
      out.write('\n');
      if (_jspx_meth_sec_005fauthentication_005f0(_jspx_page_context))
        return;
      out.write('\r');
      out.write('\n');
      if (_jspx_meth_sec_005fauthentication_005f1(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("<div class=\"container\">\r\n");
      out.write("	<div class=\"article_register my-4\">\r\n");
      out.write("		<h3>게시글 쓰기</h3>\r\n");
      out.write("	</div>\r\n");
      out.write("	<form action=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/board/register\" method=\"post\" id=\"registerForm\">\r\n");
      out.write("	<input type=\"hidden\" name=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${_csrf.parameterName}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${_csrf.token}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\">\r\n");
      out.write("		제목 : <input type=\"text\" name=\"title\"><br>\r\n");
      out.write("			 <textarea rows=\"30\" cols=\"70\" name=\"content\"></textarea><br>\r\n");
      out.write("		작성자 : <input type=\"text\" name=\"writer\" class=\"form-control\" readonly=\"readonly\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${writer}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\"><br>\r\n");
      out.write("			\r\n");
      out.write("			<button class=\"btn btn-primary\">등록</button>\r\n");
      out.write("</form>\r\n");
      out.write("<!--  \r\n");
      out.write(" <form:form action=\"register\" id=\"registerForm\" modelAttribute=\"board\">\r\n");
      out.write("   제목 : <form:input type=\"text\" path=\"title\" />\r\n");
      out.write("      <form:errors path=\"title\" class=\"error\" element=\"div\" />\r\n");
      out.write("      <br>\r\n");
      out.write("   내용 :<br>\r\n");
      out.write("      <form:textarea rows=\"30\" cols=\"50\" path=\"content\" />\r\n");
      out.write("      <br>\r\n");
      out.write("   작성자 : <form:input type=\"text\" path=\"writer\" />\r\n");
      out.write("      <form:errors path=\"writer\" />\r\n");
      out.write("      <br>\r\n");
      out.write("      <button>등록</button>\r\n");
      out.write("   </form:form>\r\n");
      out.write("-->\r\n");
      out.write("<div class=\"row\"> \r\n");
      out.write("	<div class=\"col-lg-12\">\r\n");
      out.write("		<div class=\"card\">\r\n");
      out.write("			<div class=\"card-header\">\r\n");
      out.write("				<h4>파일 첨부</h4>\r\n");
      out.write("			</div>\r\n");
      out.write("			\r\n");
      out.write("			<div class=\"card-body\">\r\n");
      out.write("				<div class=\"uploadDiv\">\r\n");
      out.write("					<input type=\"file\" name=\"uploadFile\" multiple=\"multiple\">\r\n");
      out.write("				</div>\r\n");
      out.write("				<div class=\"uploadResult\">\r\n");
      out.write("					<ul class=\"list-group\"></ul>\r\n");
      out.write("				</div>\r\n");
      out.write("			</div>\r\n");
      out.write("		</div>\r\n");
      out.write("	</div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<script>\r\n");
      out.write("	let regex = new RegExp(\"(.*?)\\.(exe|sh|js|alz)$\")\r\n");
      out.write("	let maxSize = 524288000;\r\n");
      out.write("	\r\n");
      out.write("	function checkExtension(fileName, fileSize){\r\n");
      out.write("		\r\n");
      out.write("		if(fileSize >= maxSize){\r\n");
      out.write("			alert('파일 크기 초과');\r\n");
      out.write("			return false;\r\n");
      out.write("		}\r\n");
      out.write("		if(regex.test(fileName)){\r\n");
      out.write("			alert('허용되지 않는 확장자');\r\n");
      out.write("			return false;\r\n");
      out.write("		}\r\n");
      out.write("		return true;\r\n");
      out.write("	}\r\n");
      out.write("\r\n");
      out.write("	let uploadResult = $('.uploadResult ul')\r\n");
      out.write("	function showUploadResult(uploadResultArr){\r\n");
      out.write("		if(!uploadResultArr || uploadResultArr.length == 0) return;\r\n");
      out.write("		let str = \"\";\r\n");
      out.write("		$(uploadResultArr).each(function(i, obj){\r\n");
      out.write("			if(!obj.fileType){ //이미지가 아닌 경우\r\n");
      out.write("				let fileCellPath = encodeURIComponent(obj.uploadPath + \"/\" + obj.uuid + \"_\" + obj.fileName);\r\n");
      out.write("				let fileLink = fileCellPath.replace(new RegExp(/\\\\/g),\"/\");\r\n");
      out.write("				\r\n");
      out.write("				str+= \"<li class='list-group-item' data-path='\"+obj.uploadPath+\"'\";\r\n");
      out.write("				str+= \"data-uuid='\"+obj.uuid+\"' data-filename='\"+obj.fileName+\"' data-type='\"+obj.fileType+\"'>\";\r\n");
      out.write("				str+= \"<img src='");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/resources/image/cat.jpg' style='width:100px;'>\"\r\n");
      out.write("				str+= \"<a href='");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/download?fileName=\"+fileCellPath+\"'>\"+obj.fileName+\"</a>\"\r\n");
      out.write("				str+= \"<div class='d-flex justify-content-end'><span data-file='\"+fileLink+\"' data-type='file'>삭제</span></div>\"\r\n");
      out.write("				str+= \"</li>\"\r\n");
      out.write("			}else{ //이미지인 경우\r\n");
      out.write("				let fileCellPath = encodeURIComponent(obj.uploadPath + \"/s_\" + obj.uuid + \"_\" + obj.fileName);\r\n");
      out.write("				let originPath = obj.uploadPath + \"\\\\\" + obj.uuid + \"_\" + obj.fileName;\r\n");
      out.write("				originPath = originPath.replace(new RegExp(/\\\\/g), \"/\");\r\n");
      out.write("				\r\n");
      out.write("				str+= \"<li class='list-group-item' data-path='\"+obj.uploadPath+\"'\";\r\n");
      out.write("				str+= \"data-uuid='\"+obj.uuid+\"' data-filename='\"+obj.fileName+\"' data-type='\"+obj.fileType+\"'>\";\r\n");
      out.write("				str+= \"<img src='");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/display?fileName=\"+fileCellPath+\"'>\";\r\n");
      out.write("				str+= \"<a href='javascript:showImage(\\\"\"+originPath+\"\\\")'>이미지원본보기</a>\";\r\n");
      out.write("				str+= \"<div class='d-flex justify-content-end'><span data-file='\"+fileCellPath+\"' data-type='image'>삭제</span></div>\"\r\n");
      out.write("				str+= \"</li>\"				\r\n");
      out.write("			}\r\n");
      out.write("		\r\n");
      out.write("		})\r\n");
      out.write("		uploadResult.append(str);\r\n");
      out.write("	}\r\n");
      out.write("	\r\n");
      out.write("	\r\n");
      out.write("$(function(){\r\n");
      out.write("	let form = $('#registerForm')\r\n");
      out.write("	let submitBtn = $('#registerForm button');\r\n");
      out.write("	\r\n");
      out.write("	\r\n");
      out.write("	submitBtn.on('click', function(e){\r\n");
      out.write("		e.preventDefault();\r\n");
      out.write("		\r\n");
      out.write("		let str = \"\";\r\n");
      out.write("		$('.uploadResult li').each(function(i, obj){\r\n");
      out.write("			let jobj = $(obj);\r\n");
      out.write("			console.log(jobj.data('filename'));\r\n");
      out.write("			\r\n");
      out.write("			str+= \"<input type='hidden' name='catList[\"+i+\"].fileName' value='\"+jobj.data('filename')+\"'>\"\r\n");
      out.write("			str+= \"<input type='hidden' name='catList[\"+i+\"].uuid' value='\"+jobj.data('uuid')+\"'>\"\r\n");
      out.write("			str+= \"<input type='hidden' name='catList[\"+i+\"].uploadPath' value='\"+jobj.data('path')+\"'>\"\r\n");
      out.write("			str+= \"<input type='hidden' name='catList[\"+i+\"].fileType' value='\"+jobj.data('type')+\"'>\";\r\n");
      out.write("		});\r\n");
      out.write("		form.append(str).submit();\r\n");
      out.write("	})\r\n");
      out.write("	\r\n");
      out.write("	//파일 업로드\r\n");
      out.write("	$('input[type=\"file\"]').change(function(){\r\n");
      out.write("		let formData = new FormData();\r\n");
      out.write("		let inputFiles = $('input[name=\"uploadFile\"]');\r\n");
      out.write("		let files = inputFiles[0].files;\r\n");
      out.write("		\r\n");
      out.write("		for(let f of files){\r\n");
      out.write("			if(!checkExtension(f.name, f.size)) return false;\r\n");
      out.write("			formData.append('uploadFile', f);\r\n");
      out.write("		}\r\n");
      out.write("		\r\n");
      out.write("		$.ajax({\r\n");
      out.write("			url : contextPath + '/uploadAjaxAction',\r\n");
      out.write("			type : 'post',\r\n");
      out.write("			processData : false,\r\n");
      out.write("			contentType : false,\r\n");
      out.write("			data : formData,\r\n");
      out.write("			dataType : 'json',\r\n");
      out.write("			success : function(result){\r\n");
      out.write("				showUploadResult(result);\r\n");
      out.write("			}\r\n");
      out.write("		\r\n");
      out.write("		});\r\n");
      out.write("		\r\n");
      out.write("	})\r\n");
      out.write("	\r\n");
      out.write("	$('.uploadResult ul').on('click', 'span', function(){\r\n");
      out.write("		let targetFile = $(this).data('file');\r\n");
      out.write("		let type = $(this).data('type');\r\n");
      out.write("		let targetLi = $(this).closest('li');\r\n");
      out.write("\r\n");
      out.write("		$.ajax({\r\n");
      out.write("			url : contextPath + '/deleteFile',\r\n");
      out.write("			type : 'post',\r\n");
      out.write("			data : {fileName : targetFile, type : type},\r\n");
      out.write("			dataType : 'text',\r\n");
      out.write("			success : function(result){\r\n");
      out.write("				alert(result);\r\n");
      out.write("				targetLi.remove();\r\n");
      out.write("			}\r\n");
      out.write("		})\r\n");
      out.write("		\r\n");
      out.write("	})\r\n");
      out.write("	\r\n");
      out.write("});\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<h1>상하이 상하이 상하이 트위스트 춤을 추면서</h2>\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_c_005fset_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_005fset_005f0 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    boolean _jspx_th_c_005fset_005f0_reused = false;
    try {
      _jspx_th_c_005fset_005f0.setPageContext(_jspx_page_context);
      _jspx_th_c_005fset_005f0.setParent(null);
      // /WEB-INF/views/layout/header.jspf(6,0) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fset_005f0.setVar("contextPath");
      // /WEB-INF/views/layout/header.jspf(6,0) name = value type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
      _jspx_th_c_005fset_005f0.setValue(new org.apache.jasper.el.JspValueExpression("/WEB-INF/views/layout/header.jspf(6,0) '${pageContext.request.contextPath }'",_jsp_getExpressionFactory().createValueExpression(_jspx_page_context.getELContext(),"${pageContext.request.contextPath }",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
      int _jspx_eval_c_005fset_005f0 = _jspx_th_c_005fset_005f0.doStartTag();
      if (_jspx_th_c_005fset_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.reuse(_jspx_th_c_005fset_005f0);
      _jspx_th_c_005fset_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fset_005f0, _jsp_getInstanceManager(), _jspx_th_c_005fset_005f0_reused);
    }
    return false;
  }

  private boolean _jspx_meth_sec_005fauthentication_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  sec:authentication
    org.springframework.security.taglibs.authz.AuthenticationTag _jspx_th_sec_005fauthentication_005f0 = (org.springframework.security.taglibs.authz.AuthenticationTag) _005fjspx_005ftagPool_005fsec_005fauthentication_0026_005fvar_005fproperty_005fnobody.get(org.springframework.security.taglibs.authz.AuthenticationTag.class);
    boolean _jspx_th_sec_005fauthentication_005f0_reused = false;
    try {
      _jspx_th_sec_005fauthentication_005f0.setPageContext(_jspx_page_context);
      _jspx_th_sec_005fauthentication_005f0.setParent(null);
      // /WEB-INF/views/board/register.jsp(4,0) name = property type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_sec_005fauthentication_005f0.setProperty("principal.memberVO");
      // /WEB-INF/views/board/register.jsp(4,0) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_sec_005fauthentication_005f0.setVar("memberVO");
      int _jspx_eval_sec_005fauthentication_005f0 = _jspx_th_sec_005fauthentication_005f0.doStartTag();
      if (_jspx_th_sec_005fauthentication_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fsec_005fauthentication_0026_005fvar_005fproperty_005fnobody.reuse(_jspx_th_sec_005fauthentication_005f0);
      _jspx_th_sec_005fauthentication_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_sec_005fauthentication_005f0, _jsp_getInstanceManager(), _jspx_th_sec_005fauthentication_005f0_reused);
    }
    return false;
  }

  private boolean _jspx_meth_sec_005fauthentication_005f1(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  sec:authentication
    org.springframework.security.taglibs.authz.AuthenticationTag _jspx_th_sec_005fauthentication_005f1 = (org.springframework.security.taglibs.authz.AuthenticationTag) _005fjspx_005ftagPool_005fsec_005fauthentication_0026_005fvar_005fproperty_005fnobody.get(org.springframework.security.taglibs.authz.AuthenticationTag.class);
    boolean _jspx_th_sec_005fauthentication_005f1_reused = false;
    try {
      _jspx_th_sec_005fauthentication_005f1.setPageContext(_jspx_page_context);
      _jspx_th_sec_005fauthentication_005f1.setParent(null);
      // /WEB-INF/views/board/register.jsp(5,0) name = property type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_sec_005fauthentication_005f1.setProperty("principal.username");
      // /WEB-INF/views/board/register.jsp(5,0) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_sec_005fauthentication_005f1.setVar("writer");
      int _jspx_eval_sec_005fauthentication_005f1 = _jspx_th_sec_005fauthentication_005f1.doStartTag();
      if (_jspx_th_sec_005fauthentication_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fsec_005fauthentication_0026_005fvar_005fproperty_005fnobody.reuse(_jspx_th_sec_005fauthentication_005f1);
      _jspx_th_sec_005fauthentication_005f1_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_sec_005fauthentication_005f1, _jsp_getInstanceManager(), _jspx_th_sec_005fauthentication_005f1_reused);
    }
    return false;
  }
}
