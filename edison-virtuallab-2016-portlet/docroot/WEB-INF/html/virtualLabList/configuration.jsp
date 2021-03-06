<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/common/init.jsp" %>
<style>
input[type="file"]{width:500px;border:1px solid #CCCCCC;margin-bottom:2px;}
</style>

<liferay-portlet:actionURL portletConfiguration="true" var="configurationURL" />
<liferay-portlet:resourceURL var="edisonFileDownloadURL" 
		portletName="edisonvirtuallablist_WAR_edisonvirtuallab2016portlet" escapeXml="false" id="edisonFileDownload" copyCurrentRenderParameters="false"/>
<c:set var="workspace_amespace" value="_edisonvirtuallablist_WAR_edisonvirtuallab2016portlet_"></c:set>
<aui:form action="<%= configurationURL %>" method="post" name="sampleFileSetting" enctype="multipart/form-data">
	<input name="<portlet:namespace/>myaction" type="hidden" value="fileSetting"/>
	<div id="stdFileListDiv" class="table1_list">
		<table width="100%" border="0" cellspacing="0" cellpadding="0" class="list" >
			<colgroup>
				<col width="10%" />
				<col width="*" />
			</colgroup>
			<tbody id="keySetBody">
				<tr>
					<th rowspan="2">VirtualClass Student Sample</th>
			 		<td><input type="file" name="stdAddfile"></td>
			 	</tr>
				<tr>
					<td>
						<c:forEach items="${stdFileList}" var="fileMap">
							<span style="cursor: pointer;" onclick="<portlet:namespace/>fileDownload('${fileMap.fileEntryId }')" class="onMouseHover">
								${fileMap.fileTitle }
							</span>
							<br>
						</c:forEach>
					</td>
			 	</tr>
			 </tbody>
		 </table>	
	</div>
	<br>	
	<div>
		<input type="button" value="<liferay-ui:message key='edison-button-save'/>"  onclick="<portlet:namespace/>doSubmit()"/>
	</div>
</aui:form>	
<script type="text/javascript">
function <portlet:namespace/>doSubmit(){
	$("form[name=<portlet:namespace/>sampleFileSetting]").submit();
}

function <portlet:namespace/>fileDownload(p_fileEntryId){
	location.href = "<%=edisonFileDownloadURL%>&${workspace_amespace}fileEntryId="+p_fileEntryId;
}
</script>

