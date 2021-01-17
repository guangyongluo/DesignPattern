package com.vilin.chapter16.template.example6;

import java.sql.PreparedStatement;
/**
 * �������ݿ�ķ���ʹ�õĻص��ӿ�
 */
public interface UpdateDBCallBack {
	/**
	 * ʹ��PreparedStatement����sql�е�"?"����
	 * @param pstmt PreparedStatement ����
	 * @throws Exception
	 */
	public void setValue(PreparedStatement pstmt)throws Exception;
}
