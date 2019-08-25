/**
 * @filename:PlatformDao 2019年5月5日
 * @project wallet-manage  V1.0
 * Copyright(c) 2018 BianPeng Co. Ltd. 
 * All right reserved. 
 */
package com.buybit.wm.dao;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import com.buybit.wm.entity.Platform;

/**   
 *  
 * @Description:  平台申请——DAO
 * @Author:       BianPeng   
 * @CreateDate:   2019年5月5日
 * @Version:      V1.0
 *    
 */
@Mapper
public interface PlatformDao {
	
	public Platform selectByPrimaryKey(FreeMarker template error (DEBUG mode; use RETHROW in production!):
The following has evaluated to null or missing:
==> idType  [in template "dao.ftl" at line 24, column 51]

----
Tip: If the failing expression is known to legally refer to something that's sometimes null or missing, either specify a default value like myOptionalVar!myDefault, or use <#if myOptionalVar??>when-present<#else>when-missing</#if>. (These only cover the last step of the expression; to cover the whole expression, use parenthesis: (myOptionalVar.foo)!myDefault, (myOptionalVar.foo)??
----

----
FTL stack trace ("~" means nesting-related):
	- Failed at: ${idType}  [in template "dao.ftl" at line 24, column 49]
----

Java stack trace (for programmers):
----
freemarker.core.InvalidReferenceException: [... Exception message was already printed; see it above ...]
	at freemarker.core.InvalidReferenceException.getInstance(InvalidReferenceException.java:134)
	at freemarker.core.EvalUtil.coerceModelToTextualCommon(EvalUtil.java:467)
	at freemarker.core.EvalUtil.coerceModelToStringOrMarkup(EvalUtil.java:389)
	at freemarker.core.EvalUtil.coerceModelToStringOrMarkup(EvalUtil.java:358)
	at freemarker.core.DollarVariable.calculateInterpolatedStringOrMarkup(DollarVariable.java:100)
	at freemarker.core.DollarVariable.accept(DollarVariable.java:63)
	at freemarker.core.Environment.visit(Environment.java:330)
	at freemarker.core.Environment.visit(Environment.java:336)
	at freemarker.core.Environment.process(Environment.java:309)
	at freemarker.template.Template.process(Template.java:384)
	at com.github.mybatis.fl.util.FreemarkerUtil.createFile(FreemarkerUtil.java:61)
	at com.github.mybatis.fl.util.Generator.createDao(Generator.java:46)
	at com.github.mybatis.fl.test.MyGenerator.main(MyGenerator.java:63)
