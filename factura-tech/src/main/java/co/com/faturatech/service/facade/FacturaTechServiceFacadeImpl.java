package co.com.faturatech.service.facade;

import https.SERVICESFACTURATECHStub;
import https.SERVICESFACTURATECHStub.FtechActionDownloadPDFFile;
import https.SERVICESFACTURATECHStub.FtechActionDownloadPDFFileResponse;

public class FacturaTechServiceFacadeImpl implements FacturaTechServiceFacade {

	@Override
	public String getFactura(String username, String password, String folio, String prefijo) throws Exception {
		String salida = "";
		try {
			//lo que llama el servicio
			SERVICESFACTURATECHStub stub = new SERVICESFACTURATECHStub();
			//input
			FtechActionDownloadPDFFile ftechActionDownloadPDFFile28 = new FtechActionDownloadPDFFile();

			ftechActionDownloadPDFFile28.setUsername("cgdata04102021");
			ftechActionDownloadPDFFile28
					.setPassword("41c6ef0247d178bf1d9f33309eab84ab6f71d03d10bbe431c8777e90428bb50b");
			ftechActionDownloadPDFFile28.setPrefijo("TCFA");
			ftechActionDownloadPDFFile28.setFolio("16901");
			//Response y el stub que hace la invocacion
			FtechActionDownloadPDFFileResponse response=stub.ftechActionDownloadPDFFile(ftechActionDownloadPDFFile28);
			System.out.println(response.get_return().getResourceData());
			//DTOResponse.setBase64Decodificada(response.get_return().getResourceData()));
		} catch (Exception e) {
			throw e;
		}
		return salida;
	}

}
