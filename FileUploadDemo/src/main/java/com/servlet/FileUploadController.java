package com.servlet;

import java.awt.List;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

public class FileUploadController extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		try {

			ServletFileUpload servletFileUpload = new ServletFileUpload(new DiskFileItemFactory());
			java.util.List<FileItem> files = servletFileUpload.parseRequest(request);

			for (FileItem item : files) {
				item.write(new File("/home/kajal/eclipse-workspace/FileUploadDemo/" + item.getName()));
			}
			PrintWriter out= response.getWriter();
			out.print("file Successfully uploaded");

		} catch (Exception e) {
		}

		// List<FileItem> files= new
	}

}
