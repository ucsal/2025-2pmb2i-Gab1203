package br.com.mariojp.solid.isp;

public class OfficeService {
    private final MultiFunctionDevice device;
    public OfficeService(Printer device){ this.device =  (SimplePrinter) device; }
    public void printReport(String content){
        device.print(content);
        // BUG: chama scan sem necessidade
        device.scan("audit.txt");
    }
}
