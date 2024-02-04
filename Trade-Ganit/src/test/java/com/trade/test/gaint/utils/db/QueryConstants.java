package com.trade.test.gaint.utils.db;

/**
 * @author Onkar663100
 * @author dhiraj662364
 */

public class QueryConstants {
	
	public static final String PARAM_STRING = "!!!QUERYPARAM!!!";
	public static final String BLANK_STRING = "";
	public static final String FETCH_ADD_CONTRACT_ENTITY_STATUS = "SELECT t3.LICENSE_NO, t2.ENTITY_STATUS, t1.APPLICATION_STATUS from DM_APP_MASTER t1, DM_ENTITY_REGISTER t2, DM_APP_LICENSE_DETAILS t3 where t1.ID=t2.APPLICATION_ID and t3.APPLICATION_ID=t2.APPLICATION_ID and t3.LICENSE_NO=?";
	public static final String FETCH_ADD_SATE_APPOINTMENT_ENTITY_STATUS = "SELECT t3.LICENSE_NO,t3.STATE_CODE, t1.APPLICATION_STATUS FROM DM_APP_MASTER t1,DM_APP_LICENSE_DETAILS t2, DM_ENTITY_APPOINTMENTS t3 WHERE t1.ID=t2.APPLICATION_ID and t2.APPLICATION_ID=t3.APPLICATION_ID and t3.LICENSE_NO=?";
	public static final String REMOVE_ENTITY_LOB = "DELETE FROM DM_ENTITY_LOB WHERE ENTITY_APPOINTMENT_ID IN (SELECT ID FROM DM_ENTITY_APPOINTMENTS WHERE STATE_CODE = ? AND LICENSE_NO = ? AND client_id IN (select client_id from dm_M_CLIENT where npn = ?))";
	public static final String REMOVE_ENTITY_APPOINTMENT = "DELETE FROM DM_ENTITY_APPOINTMENTS WHERE STATE_CODE = ? AND LICENSE_NO = ? AND client_id IN (select client_id from dm_M_CLIENT where npn = ?)";
	public static final String FETCH_STATE_CODE = "SELECT STATE_CODE FROM DM_ENTITY_APPOINTMENTS WHERE LICENSE_NO = ? AND ROWNUM = 1";
	public static final String FETCH_EVENT_DATA = "SELECT EVENT_DATA FROM impl_dm_eventdatastore WHERE EVENT_NAME= ? AND CLIENT_ID in (Select CLIENT_ID from dm_app_master where NPN = ? AND APPLICATION_TYPE = 'NPC')";
	public static final String FETCH_MASTER_NUMBER = "Select BASE_ENTITY_ID from dm_entity_register where ENTITY_CODE = ?";
	public static final String UPDATE_FG_MASTER_NUMBER = "UPDATE DM_BASE_ENTITY SET IMPL_FGL_MIGRATED_MASTER_ID = ? WHERE CLIENT_ID in(Select CLIENT_ID from dm_entity_register where ENTITY_CODE = ?)";
	public static final String FETCH_FG_MASTER_NUMBER = "Select IMPL_FGL_MIGRATED_MASTER_ID from DM_BASE_ENTITY where CLIENT_ID in (Select CLIENT_ID from dm_entity_register where ENTITY_CODE = ?)";
	public static final String FETCH_CONTRACT_E_DATE = "select IMPL_CONTRACT_EFF_DATE from DM_ENTITY_REGISTER where ENTITY_CODE= ?";

}