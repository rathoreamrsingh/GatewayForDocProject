/**
 * 
 */
package com.doc.mstr.Gateway.Server;

import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.spi.LoggerFactory;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;

/**
 * @author amar
 *
 */
public class PreFilter extends ZuulFilter {
	@Override
	public String filterType() {
		return "pre";
	}

	@Override
	public int filterOrder() {
		return 1;
	}

	@Override
	public boolean shouldFilter() {
		return true;
	}

	@Override
	public Object run() {
		RequestContext ctx = RequestContext.getCurrentContext();
		System.out.println("============================================================");
		System.out.println("Request method in PreFilter : " + ctx.getRequest().getMethod());
		System.out.println("============================================================");
		return null;
	}
}