package py.una.pol.protocolos;

public class Frame {
	
	public enum frameKind{DATA, ACK, NACK};
	
	private frameKind kind; //qué tipo de trama es?
	private int seqNum; //número de secuencia.
	private int seqACK; //número de confirmación de recepción.
	private Packet packet; //paquete de la capa de red
	
	public frameKind getKind() {
		return kind;
	}
	
	public void setKind(frameKind kind) {
		this.kind = kind;
	}
	
	public int getSeqNum() {
		return seqNum;
	}
	
	public void setSeqNum(int seqNum) {
		this.seqNum = seqNum;
	}
	
	public int getSeqACK() {
		return seqACK;
	}
	
	public void setSeqACK(int seqACK) {
		this.seqACK = seqACK;
	}
	
	public Packet getPacket() {
		return packet;
	}
	
	public void setPacket(Packet packet) {
		this.packet = packet;
	}

}
