module common_project_admin {
	exports admin.main;
	exports admin.controller;
	exports admin.dto;
	exports admin.service;
	exports admin.dao;

	requires java.sql;
	requires javafx.base;
	requires javafx.controls;
	requires javafx.fxml;
	requires javafx.graphics;
	
	opens admin.controller;
}