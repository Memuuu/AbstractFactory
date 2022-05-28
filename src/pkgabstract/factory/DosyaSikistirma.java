
package pkgabstract.factory;


interface DosyaSikistirma {
    String compString(String file);
}

class Zip implements DosyaSikistirma{
    String uzanti;
    public Zip(String uzanti){
        this.uzanti = uzanti;
    }
    public String compString(String file){
        return file + uzanti;
    }
}

class Rar implements DosyaSikistirma{
    String uzanti;
    public Rar(String uzanti){
        this.uzanti = uzanti;
    }
    public String compString(String file){
        return file + uzanti;
    }
    
}


class Factory {
    
    
    public DosyaSikistirma sikistirmaYontemi(String tip){
        switch(tip){
            case "zip": return new Zip(".zip");
            case "rar": return new Zip(".rar");
            default: return null;
        }
    }
    
    
    
}