package eLaundry.JMSReciver;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.ObjectMessage;

import elaundry.domain.SOrder;


public class JMSReceiver implements MessageListener {

    public void onMessage(Message message){
    	ObjectMessage objmessage = (ObjectMessage)message;
    	try {
    		SOrder order = (SOrder)objmessage.getObject();
			System.out.println(this.getClass().getSimpleName() + " receives message from eLaundrySystem Order Status: " + order.getOrderStatus());
		} catch (JMSException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
}

