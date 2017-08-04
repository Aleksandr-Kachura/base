/*
 * [y] hybris Platform
 *
 * Copyright (c) 2017 SAP SE or an SAP affiliate company.  All rights reserved.
 *
 * This software is the confidential and proprietary information of SAP
 * ("Confidential Information"). You shall not disclose such Confidential
 * Information and shall use it only in accordance with the terms of the
 * license agreement you entered into with SAP.
 */
package de.hybris.widgets;

import org.zkoss.zk.ui.Component;
import org.zkoss.zk.ui.select.annotation.WireVariable;
import org.zkoss.zul.Label;

import de.hybris.services.BasebackofficeService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.hybris.cockpitng.util.DefaultWidgetController;


public class BasebackofficeController extends DefaultWidgetController
{
	private static final long serialVersionUID = 1L;
	private Label label;
	private static final Logger LOG = LoggerFactory.getLogger(BasebackofficeController.class);
	@WireVariable
	private BasebackofficeService basebackofficeService;

	@Override
	public void initialize(final Component comp)
	{
		super.initialize(comp);
		label.setValue(basebackofficeService.getHello2() + " BasebackofficeController");
		LOG.info("333333");

	}
}
