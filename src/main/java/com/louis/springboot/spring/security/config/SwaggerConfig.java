package com.louis.springboot.spring.security.config;
import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.ParameterBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.schema.ModelRef;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Parameter;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * 类      说明  ：  Swagger配置
 * 作        者  ：  yucheng
 * 最后修改时间  ：  2019-03-21
 */
@Configuration
@EnableSwagger2
public class SwaggerConfig {

	/**
	 * 方法    说明  ：  创建Swagger API的样式
	 * 作        者  ：  yucheng
	 * 最后修改时间  ：  2019-03-21
	 */
    @Bean
    public Docket createRestApi(){
    	// 添加请求参数，我们这里把token作为请求头部参数传入后端
		ParameterBuilder parameterBuilder = new ParameterBuilder();
		List<Parameter> parameters = new ArrayList<Parameter>();
		parameterBuilder.name("Authorization").description("令牌").modelRef(new ModelRef("string")).parameterType("header")
				.required(false).build();
		parameters.add(parameterBuilder.build());
		return new Docket(DocumentationType.SWAGGER_2).apiInfo(apiInfo()).select().apis(RequestHandlerSelectors.any())
				.paths(PathSelectors.any()).build().globalOperationParameters(parameters);
    }

    private ApiInfo apiInfo(){
        return new ApiInfoBuilder().build();
    }

}