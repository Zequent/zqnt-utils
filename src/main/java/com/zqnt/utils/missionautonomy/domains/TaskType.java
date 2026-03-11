package com.zqnt.utils.missionautonomy.domains;

/**
 * Defines available task action types for mission autonomy.
 * Each type represents a specific autonomous action the drone can perform.
 */
public enum TaskType {
    /**
     * Object/feature detection action
     */
    TASK_TYPE_DETECT,

    /**
     * Area mapping/survey action
     */
    TASK_TYPE_AREA_MAPPING,

    /**
     * Waypoint-based flight action
     */
    TASK_TYPE_WAYPOINT,

    /**
     * Point of interest orbit action
     */
    TASK_TYPE_POI,

    /**
     * Follow target action (dynamic following)
     */
    TASK_TYPE_FOLLOW,

    /**
     * Track target action (lock and track)
     */
    TASK_TYPE_TRACK,

    /**
     * Counter-drone action (future)
     */
    TASK_TYPE_COUNTER_DRONE,
    TASK_TYPE_UNSPECIFIED,

    UNRECOGNIZED,
}
