//package com.zhp.bootweb01.config;
//
//import com.alibaba.druid.pool.DruidDataSource;
//import com.alibaba.druid.support.http.StatViewServlet;
//import com.alibaba.druid.support.http.WebStatFilter;
//import org.springframework.boot.context.properties.ConfigurationProperties;
//import org.springframework.boot.web.servlet.FilterRegistrationBean;
//import org.springframework.boot.web.servlet.ServletRegistrationBean;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
//import javax.servlet.Filter;
//import javax.servlet.Servlet;
//import javax.servlet.annotation.WebFilter;
//import javax.sql.DataSource;
//import java.sql.SQLException;
//import java.util.Arrays;
//
//@Configuration
//public class DataSourceConfig {
//    @ConfigurationProperties("spring.datasource")
//    @Bean
//    public DataSource dataSource() throws SQLException {
//        DruidDataSource druidDataSource = new DruidDataSource();
//        druidDataSource.setFilters("stat,wall");
//        return  druidDataSource;
//    }
//
//    @Bean
//    public ServletRegistrationBean statViewServlet(){
//        StatViewServlet statViewServlet = new StatViewServlet();
//        ServletRegistrationBean<Servlet> servletServletRegistrationBean = new ServletRegistrationBean<>(statViewServlet,"/druid/*");
//        servletServletRegistrationBean.addInitParameter("loginUsername","小蟑");
//        servletServletRegistrationBean.addInitParameter("loginPassword","123456");
//        return servletServletRegistrationBean;
//    }
//    @Bean
//    public FilterRegistrationBean statFilter(){
//        WebStatFilter webStatFilter = new WebStatFilter();
//        FilterRegistrationBean<WebStatFilter> filterFilterRegistrationBean = new FilterRegistrationBean<WebStatFilter>(webStatFilter);
//        filterFilterRegistrationBean.setUrlPatterns(Arrays.asList("/*"));
//        filterFilterRegistrationBean.addInitParameter("exclusions","*.js,*.gif,*.jpg,*.png,*.css,*.ico,/druid/*");
//        return filterFilterRegistrationBean;
//    }
//}
