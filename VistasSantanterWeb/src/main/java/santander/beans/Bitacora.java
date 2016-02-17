package santander.beans;

public class Bitacora {
	String   CCCExt_Fecha_Carga,
			 Hora_Carga,
			 CCCExt_Nom_Arch_Orig,
			 Ruta_Archivo,
			 Desc_Tipo;
	
	int CCCExt_CantReg_Infor,
		CCCExt_ID;
	
	double CCCExt_MontoPagado_Info;
	
	
	public String getCCCExt_Fecha_Carga() {
		return CCCExt_Fecha_Carga;
	}
	public void setCCCExt_Fecha_Carga(String cCCExt_Fecha_Carga) {
		CCCExt_Fecha_Carga = cCCExt_Fecha_Carga;
	}
	public int getCCCExt_CantReg_Infor() {
		return CCCExt_CantReg_Infor;
	}
	public void setCCCExt_CantReg_Infor(int cCCExt_CantReg_Infor) {
		CCCExt_CantReg_Infor = cCCExt_CantReg_Infor;
	}
	public double getCCCExt_MontoPagado_Info() {
		return CCCExt_MontoPagado_Info;
	}
	public void setCCCExt_MontoPagado_Info(double cCCExt_MontoPagado_Info) {
		CCCExt_MontoPagado_Info = cCCExt_MontoPagado_Info;
	}
	public int getCCCExt_ID() {
		return CCCExt_ID;
	}
	public void setCCCExt_ID(int cCCExt_ID) {
		CCCExt_ID = cCCExt_ID;
	}
	public String getHora_Carga() {
		return Hora_Carga;
	}
	public void setHora_Carga(String hora_Carga) {
		Hora_Carga = hora_Carga;
	}
	public String getCCCExt_Nom_Arch_Orig() {
		return CCCExt_Nom_Arch_Orig;
	}
	public void setCCCExt_Nom_Arch_Orig(String cCCExt_Nom_Arch_Orig) {
		CCCExt_Nom_Arch_Orig = cCCExt_Nom_Arch_Orig;
	}
	public String getDesc_Tipo() {
		return Desc_Tipo;
	}
	public void setDesc_Tipo(String desc_Tipo) {
		Desc_Tipo = desc_Tipo;
	}
	public String getRuta_Archivo() {
		return Ruta_Archivo;
	}
	public void setRuta_Archivo(String ruta_Archivo) {
		Ruta_Archivo = ruta_Archivo;
	}

	
}
