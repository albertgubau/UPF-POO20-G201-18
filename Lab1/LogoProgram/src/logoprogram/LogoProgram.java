/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logoprogram;

/**
 *
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class LogoProgram {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Program p = new Program("Square");
        p.addInstruction("REP", 4);
        p.addInstruction("FWD", 100);
        p.addInstruction("ROT", 90);
        p.addInstruction("END", 1);
        
        if(p.isCorrect()){
            p.restart();
            while(!p.hasFinished()){
                Instruction instr = p.getNextInstruction();
                if(!instr.isRepInstruction()){
                    
                    System.out.println(instr.info());
                }
            }
        }else{
           p.printErrors(); 
        }
    }
}
