$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/activities/CalendarEvents.feature");
formatter.feature({
  "name": "All calendar events",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@calendar_events"
    }
  ]
});
formatter.scenario({
  "name": "Verify column names",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@calendar_events"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user is on the login page",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginStepDefinitions.user_is_on_the_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user logs in as store manager",
  "keyword": "And "
});
formatter.match({
  "location": "LoginStepDefinitions.user_logs_in_as_store_manager()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user navigates to \"Activities\" then to \"Calendar Events\"",
  "keyword": "Then "
});
formatter.match({
  "location": "TopMenuStepDefinitions.user_navigates_to_then_to(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user verifies that column names are displayed",
  "rows": [
    {
      "cells": [
        "TITLE"
      ]
    },
    {
      "cells": [
        "CALENDAR"
      ]
    },
    {
      "cells": [
        "START"
      ]
    },
    {
      "cells": [
        "END"
      ]
    },
    {
      "cells": [
        "RECURRENT"
      ]
    },
    {
      "cells": [
        "RECURRENCE"
      ]
    },
    {
      "cells": [
        "INVITATION STATUS"
      ]
    }
  ],
  "keyword": "And "
});
formatter.match({
  "location": "CalendarEventsStepDefinitions.user_verifies_that_column_names_are_displayed(String\u003e)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Verify that view, edit and delete calendar options are displayed",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@calendar_events"
    },
    {
      "name": "@homework_4_1"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user is on the login page",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginStepDefinitions.user_is_on_the_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user logs in as store manager",
  "keyword": "And "
});
formatter.match({
  "location": "LoginStepDefinitions.user_logs_in_as_store_manager()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user navigates to \"Activities\" then to \"Calendar Events\"",
  "keyword": "Then "
});
formatter.match({
  "location": "TopMenuStepDefinitions.user_navigates_to_then_to(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user verifies that following options are displayed for \"Testers meeting\" calendar event",
  "rows": [
    {
      "cells": [
        "Delete"
      ]
    },
    {
      "cells": [
        "Edit"
      ]
    },
    {
      "cells": [
        "View"
      ]
    }
  ],
  "keyword": "And "
});
formatter.match({
  "location": "CalendarEventsStepDefinitions.user_verifies_that_following_options_are_displayed_for_calendar_event(String,String\u003e)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Verify that \"Title\" column still displayed",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@calendar_events"
    },
    {
      "name": "@homework_4_2"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user is on the login page",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginStepDefinitions.user_is_on_the_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user logs in as store manager",
  "keyword": "And "
});
formatter.match({
  "location": "LoginStepDefinitions.user_logs_in_as_store_manager()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user navigates to \"Activities\" then to \"Calendar Events\"",
  "keyword": "Then "
});
formatter.match({
  "location": "TopMenuStepDefinitions.user_navigates_to_then_to(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user \"deselects\" following grid options",
  "rows": [
    {
      "cells": [
        "CALENDAR"
      ]
    },
    {
      "cells": [
        "START"
      ]
    },
    {
      "cells": [
        "END"
      ]
    },
    {
      "cells": [
        "RECURRENT"
      ]
    },
    {
      "cells": [
        "RECURRENCE"
      ]
    },
    {
      "cells": [
        "INVITATION STATUS"
      ]
    }
  ],
  "keyword": "And "
});
formatter.match({
  "location": "CalendarEventsStepDefinitions.user_following_grid_options(String,String\u003e)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user verifies that column names are displayed",
  "rows": [
    {
      "cells": [
        "TITLE"
      ]
    }
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "CalendarEventsStepDefinitions.user_verifies_that_column_names_are_displayed(String\u003e)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Verify save and close drop-down",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@calendar_events"
    },
    {
      "name": "@homework_4_3"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user is on the login page",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginStepDefinitions.user_is_on_the_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user logs in as store manager",
  "keyword": "And "
});
formatter.match({
  "location": "LoginStepDefinitions.user_logs_in_as_store_manager()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user navigates to \"Activities\" then to \"Calendar Events\"",
  "keyword": "Then "
});
formatter.match({
  "location": "TopMenuStepDefinitions.user_navigates_to_then_to(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks on \"Create Calendar Event\" button",
  "keyword": "And "
});
formatter.match({
  "location": "CalendarEventsStepDefinitions.user_clicks_on_button(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should see following save and close options",
  "rows": [
    {
      "cells": [
        "Save And Close"
      ]
    },
    {
      "cells": [
        "Save And New"
      ]
    },
    {
      "cells": [
        "Save"
      ]
    }
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "CalendarEventsStepDefinitions.user_should_see_following_save_and_close_options(String\u003e)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Verify that cancel button redirects user to \"All Calendar Events\" page",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@calendar_events"
    },
    {
      "name": "@homework_4_4"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user is on the login page",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginStepDefinitions.user_is_on_the_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user logs in as store manager",
  "keyword": "And "
});
formatter.match({
  "location": "LoginStepDefinitions.user_logs_in_as_store_manager()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user navigates to \"Activities\" then to \"Calendar Events\"",
  "keyword": "Then "
});
formatter.match({
  "location": "TopMenuStepDefinitions.user_navigates_to_then_to(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks on \"Create Calendar Event\" button",
  "keyword": "And "
});
formatter.match({
  "location": "CalendarEventsStepDefinitions.user_clicks_on_button(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks on \"Cancel\" button",
  "keyword": "And "
});
formatter.match({
  "location": "CalendarEventsStepDefinitions.user_clicks_on_button(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user verifies that \"All Calendar Events\" page subtitle is displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStepDefinitions.user_verifies_that_page_subtitle_is_displayed(String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Verify that difference between start and end time is exactly 1 hour",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@calendar_events"
    },
    {
      "name": "@homework_4_5"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user is on the login page",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginStepDefinitions.user_is_on_the_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user logs in as store manager",
  "keyword": "And "
});
formatter.match({
  "location": "LoginStepDefinitions.user_logs_in_as_store_manager()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user navigates to \"Activities\" then to \"Calendar Events\"",
  "keyword": "Then "
});
formatter.match({
  "location": "TopMenuStepDefinitions.user_navigates_to_then_to(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks on \"Create Calendar Event\" button",
  "keyword": "And "
});
formatter.match({
  "location": "CalendarEventsStepDefinitions.user_clicks_on_button(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user verifies that end time is 1 hour after start time",
  "keyword": "Then "
});
formatter.match({
  "location": "CalendarEventsStepDefinitions.user_verifies_that_end_time_is_hour_after_start_time(Integer)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Verify that difference between start and end time is exactly 1 hour",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@calendar_events"
    },
    {
      "name": "@homework_4_6"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user is on the login page",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginStepDefinitions.user_is_on_the_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user logs in as store manager",
  "keyword": "And "
});
formatter.match({
  "location": "LoginStepDefinitions.user_logs_in_as_store_manager()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user navigates to \"Activities\" then to \"Calendar Events\"",
  "keyword": "Then "
});
formatter.match({
  "location": "TopMenuStepDefinitions.user_navigates_to_then_to(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks on \"Create Calendar Event\" button",
  "keyword": "And "
});
formatter.match({
  "location": "CalendarEventsStepDefinitions.user_clicks_on_button(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user sets starts time to \"9:00 PM\"",
  "keyword": "Then "
});
formatter.match({
  "location": "CalendarEventsStepDefinitions.user_sets_starts_time_to(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user verifies that end time is \"10:00 PM\"",
  "keyword": "And "
});
formatter.match({
  "location": "CalendarEventsStepDefinitions.user_verifies_that_end_time_is(String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Verify that start and time input boxes become invisible after selecting all day event",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@calendar_events"
    },
    {
      "name": "@homework_4_7"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user is on the login page",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginStepDefinitions.user_is_on_the_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user logs in as store manager",
  "keyword": "And "
});
formatter.match({
  "location": "LoginStepDefinitions.user_logs_in_as_store_manager()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user navigates to \"Activities\" then to \"Calendar Events\"",
  "keyword": "Then "
});
formatter.match({
  "location": "TopMenuStepDefinitions.user_navigates_to_then_to(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks on \"Create Calendar Event\" button",
  "keyword": "And "
});
formatter.match({
  "location": "CalendarEventsStepDefinitions.user_clicks_on_button(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user \"selects\" \"All-Day Event\" option",
  "keyword": "Then "
});
formatter.match({
  "location": "CalendarEventsStepDefinitions.user_option(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user \"selects\" \"All-Day Event\" option",
  "keyword": "And "
});
formatter.match({
  "location": "CalendarEventsStepDefinitions.user_option(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user verifies that \"All-Day Event\" option is selected",
  "keyword": "Then "
});
formatter.match({
  "location": "CalendarEventsStepDefinitions.user_verifies_that_option_is_selected(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user verifies that end time is not visible",
  "keyword": "And "
});
formatter.match({
  "location": "CalendarEventsStepDefinitions.user_verifies_that_end_time_is_not_visible()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user verifies that start date is visible",
  "keyword": "Then "
});
formatter.match({
  "location": "CalendarEventsStepDefinitions.user_verifies_that_start_date_is_visible()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user verifies that end date is visible",
  "keyword": "And "
});
formatter.match({
  "location": "CalendarEventsStepDefinitions.user_verifies_that_end_date_is_visible()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Verify that repeats options are available",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@calendar_events"
    },
    {
      "name": "@homework_4_8"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user is on the login page",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginStepDefinitions.user_is_on_the_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user logs in as store manager",
  "keyword": "And "
});
formatter.match({
  "location": "LoginStepDefinitions.user_logs_in_as_store_manager()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user navigates to \"Activities\" then to \"Calendar Events\"",
  "keyword": "Then "
});
formatter.match({
  "location": "TopMenuStepDefinitions.user_navigates_to_then_to(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks on \"Create Calendar Event\" button",
  "keyword": "And "
});
formatter.match({
  "location": "CalendarEventsStepDefinitions.user_clicks_on_button(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user \"selects\" \"Repeat\" option",
  "keyword": "When "
});
formatter.match({
  "location": "CalendarEventsStepDefinitions.user_option(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user verifies that \"Repeat\" option is selected",
  "keyword": "Then "
});
formatter.match({
  "location": "CalendarEventsStepDefinitions.user_verifies_that_option_is_selected(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user verifies that following options for repeats drop-down are available",
  "rows": [
    {
      "cells": [
        "Daily"
      ]
    },
    {
      "cells": [
        "Weekly"
      ]
    },
    {
      "cells": [
        "Monthly"
      ]
    },
    {
      "cells": [
        "Yearly"
      ]
    }
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "CalendarEventsStepDefinitions.user_verifies_that_following_options_for_repeats_drop_down_are_available(String\u003e)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Verify that start and time input boxes become invisible after selecting all day event",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@calendar_events"
    },
    {
      "name": "@homework_4_9"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user is on the login page",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginStepDefinitions.user_is_on_the_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user logs in as store manager",
  "keyword": "And "
});
formatter.match({
  "location": "LoginStepDefinitions.user_logs_in_as_store_manager()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user navigates to \"Activities\" then to \"Calendar Events\"",
  "keyword": "Then "
});
formatter.match({
  "location": "TopMenuStepDefinitions.user_navigates_to_then_to(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks on \"Create Calendar Event\" button",
  "keyword": "And "
});
formatter.match({
  "location": "CalendarEventsStepDefinitions.user_clicks_on_button(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user \"selects\" \"Repeat\" option",
  "keyword": "When "
});
formatter.match({
  "location": "CalendarEventsStepDefinitions.user_option(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user verifies that \"Repeat\" option is selected",
  "keyword": "Then "
});
formatter.match({
  "location": "CalendarEventsStepDefinitions.user_verifies_that_option_is_selected(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user verifies that \"Repeat Every\" option is selected",
  "keyword": "And "
});
formatter.match({
  "location": "CalendarEventsStepDefinitions.user_verifies_that_option_is_selected(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user verifies that \"Never\" option is selected",
  "keyword": "And "
});
formatter.match({
  "location": "CalendarEventsStepDefinitions.user_verifies_that_option_is_selected(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user verifies summary text is exactly \"Daily every 1 day\"",
  "keyword": "And "
});
formatter.match({
  "location": "CalendarEventsStepDefinitions.user_verifies_summary_text_is_exactly(String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Verify that following message as a summary is displayed: \"Daily every 1 day, end after 10 occurrences\"",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@calendar_events"
    },
    {
      "name": "@homework_4_10"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user is on the login page",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginStepDefinitions.user_is_on_the_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user logs in as store manager",
  "keyword": "And "
});
formatter.match({
  "location": "LoginStepDefinitions.user_logs_in_as_store_manager()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user navigates to \"Activities\" then to \"Calendar Events\"",
  "keyword": "Then "
});
formatter.match({
  "location": "TopMenuStepDefinitions.user_navigates_to_then_to(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks on \"Create Calendar Event\" button",
  "keyword": "And "
});
formatter.match({
  "location": "CalendarEventsStepDefinitions.user_clicks_on_button(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user \"selects\" \"Repeat\" option",
  "keyword": "When "
});
formatter.match({
  "location": "CalendarEventsStepDefinitions.user_option(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user verifies that \"Repeat\" option is selected",
  "keyword": "Then "
});
formatter.match({
  "location": "CalendarEventsStepDefinitions.user_verifies_that_option_is_selected(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user \"selects\" \"After\" option",
  "keyword": "When "
});
formatter.match({
  "location": "CalendarEventsStepDefinitions.user_option(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "enters \"10\" occurrences",
  "keyword": "And "
});
formatter.match({
  "location": "CalendarEventsStepDefinitions.enters_occurrences(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user verifies summary text is exactly \"Daily every 1 day, end after 10 occurrences\"",
  "keyword": "Then "
});
formatter.match({
  "location": "CalendarEventsStepDefinitions.user_verifies_summary_text_is_exactly(String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});