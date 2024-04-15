package org.openmrs.module.laboratoryapp.page.controller;

import org.openmrs.module.appui.UiSessionContext;
import org.openmrs.module.kenyaui.annotation.AppPage;
import org.openmrs.module.laboratoryapp.LaboratoryConstants;
import org.openmrs.module.laboratoryapp.ReferenceApplicationWebConstants;
import org.openmrs.ui.framework.UiUtils;
import org.openmrs.ui.framework.page.PageModel;
import org.openmrs.ui.framework.page.PageRequest;
import org.springframework.web.bind.annotation.RequestParam;
import java.util.Date;

/**
 * Created by HealthIT
 */
@AppPage(LaboratoryConstants.APP_LABORATORY_APP)
public class MainPageController {
   
    public String get(UiSessionContext sessionContext,
                      PageModel model,
                      PageRequest pageRequest,
                      UiUtils ui,
                      @RequestParam(value = "patientId", required = false) Integer patientId,
            @RequestParam(value = "gender", required = false) String gender
					  
					  ) {
		 
        model.addAttribute("date", new Date());
        model.addAttribute("patientId", patientId);
        model.addAttribute("gender", gender);
        return null;
    }
	

	

	
	
}
