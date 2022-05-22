class RnaTranscription {

    String transcribe(String dnaStrand) {
        String rnaStrand="";
        for(int i=0;i<dnaStrand.length();i++){
            char ch = dnaStrand.charAt(i);
            if(ch=='G')
                rnaStrand=rnaStrand+'C';
            else if(ch=='C')
                rnaStrand=rnaStrand+'G';
            else if(ch=='T')
                rnaStrand=rnaStrand+'A';
            else if(ch=='A')
                rnaStrand=rnaStrand+'U';
        }
        return rnaStrand;
    }

}
