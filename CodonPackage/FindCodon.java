package codon;

public class FindCodon
{
    public void find(String s)
    {
        String seq = s.toLowerCase();

        switch(seq)
        {
            case "alanine":
                System.out.println("The amino acid is 'Alanine' and it's codons are : GCU, GCC, GCA, GCG\n");
                break;
            case "cysteine":
                System.out.println("The amino acid is 'Cysteine' and it's codons are : UGU, UGC\n");
                break;
            case "aspartate":
			case "aspartic acid":
                System.out.println("The amino acid is 'Aspartic acid' and it's codons are : GAU, GAC\n");
                break;
            case "glutamate":
			case "glutamic acid":
                System.out.println("The amino acid is 'Glutamic acid' and it's codons are : GAA, GAG\n");
                break;
            case "phenylalanine":
                System.out.println("The amino acid is 'Phenylalanine' and it's codons are : UUU, UUC\n");
                break;
            case "glycine":
                System.out.println("The amino acid is 'Glycine' and it's codons are : GGG, GGA, GGC, GGU\n");
                break;
            case "histidine":
                System.out.println("The amino acid is 'Histidine' and it's codons are : CAU, CAC\n");
                break;
            case "isoleucine":
                System.out.println("The amino acid is 'Isoleucine' and it's codons are : AUU, AUC, AUA\n");
                break;
            case "lysine":
                System.out.println("The amino acid is 'Lysine' and it's codons are : AAA, AAG\n");
                break;
            case "leucine":
                System.out.println("The amino acid is 'Leucine' and it's codons are : CUU, CUC, CUA, CUG\n");
                break;
            case "methionine":
                System.out.println("The amino acid is 'Methionine' and it's codons are : AUG\n");
                break;
            case "asparagine":
                System.out.println("The amino acid is 'Aspargine' and it's codons are : AAU, AAC\n");
                break;
            case "glutamine":
                System.out.println("The amino acid is 'Glutamine\n' and it's codons are : CAA, CAG");
                break;
            case "arginine":
                System.out.println("The amino acid is 'Arginine' and it's codons are : CGA, CGU, CGC, CGG, AGA, AGG\n");
                break;
            case "serine":
                System.out.println("The amino acid is 'Serine' and it's codons are : AGU, AGC\n");
                break;
            case "threonine":
                System.out.println("The amino acid is 'Threoine' and it's codons are : ACA, ACU, ACC, ACG\n");
                break;
            case "valine":
                System.out.println("The amino acid is 'Valine' and it's codons are : GUA, GUU, GUC, GUG\n");
                break;
            case "tryptophan":
                System.out.println("The amino acid is 'Tryptophan' and it's codons are : UGG\n");
                break;
            case "tyrosine":
                System.out.println("The amino acid is 'Tyrosine' and it's codons are : UAU, UAC\n");
                break;
            case "proline":
                System.out.println("The amino acid is 'Proline' and it's codons are : CCU, CCC, CCA, CCG \n");
                break;
            default :
                System.out.println("Invalid entry !");
                break;
        }
    }

}