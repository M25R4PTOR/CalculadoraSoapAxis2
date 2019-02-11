package org.tempuri;

import java.net.MalformedURLException;
import java.rmi.RemoteException;

import org.tempuri.CalculatorStub.Add;
import org.tempuri.CalculatorStub.AddResponse;
import org.tempuri.CalculatorStub.Subtract;
import org.tempuri.CalculatorStub.SubtractResponse;

public class UsarCalculadora {

	public static void main(String[] args) throws MalformedURLException, RemoteException {
		String url = "http://www.dneonline.com/calculator.asmx?wsdl";
		CalculatorStub calculadora = new CalculatorStub(null, url);

		Add aux = new Add();
		aux.setIntA(10);
		aux.setIntB(5);
		AddResponse resultadoAdd = calculadora.add(aux);

		Subtract resultadoSub = new Subtract();
		resultadoSub.setIntA(26);
		resultadoSub.setIntB(6);
		SubtractResponse resultadoResta = calculadora.subtract(resultadoSub);

		System.out.println("Suma:" + resultadoAdd.getAddResult());
		System.out.println("Resta:" + resultadoResta.getSubtractResult());

	}
}