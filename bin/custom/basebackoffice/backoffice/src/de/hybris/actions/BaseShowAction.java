package de.hybris.actions;

import com.hybris.cockpitng.actions.ActionContext;
import com.hybris.cockpitng.actions.ActionResult;
import com.hybris.cockpitng.actions.CockpitAction;
import de.hybris.platform.core.model.ItemModel;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.annotation.Resource;
import java.util.Set;

public class BaseShowAction implements CockpitAction<Set<ItemModel>, Object>
{

    private static final Logger LOG = LoggerFactory.getLogger(BaseShowAction.class);

    @Override
    public ActionResult<Object> perform(final ActionContext<Set<ItemModel>> ctx)
    {
        return new ActionResult<>(ActionResult.SUCCESS);
    }

}