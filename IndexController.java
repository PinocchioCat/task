package com.tasks.controller;

import org.apache.log4j.Logger;

import com.jt.platform.annotation.Controller;
import com.jt.platform.controller.BaseController;

/**
 * 首页处理
 */
@SuppressWarnings("unused")
@Controller(controllerKey = { "/jf/tasks/index" })
public class IndexController extends BaseController {
	private static Logger log = Logger.getLogger(IndexController.class);

	/**
	 * 工作量管理平台首页content
	 */
	public void content() {
		// 日历控件，显示用户的信息工作信息
		// 非管理员
		if (!isAdmin()) {
			redirect("/jf/tasks/portal_member/");
			return;
		} else {
			// 用户portal
			// redirect("/jf/tasks/portal_agency/leadersView");
			// return;
		}

		// 管理员的 是空白的
		render("/platform/dashboard/home.html");
	}
}
