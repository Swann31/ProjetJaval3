package gestionnairedemission;

import java.util.Date;

/**
 * <b> Classe Mission </b>
 * <p> Cette classe sert à définir une mission dans l'application. </p>
 * @author Swann LAZAR, Maxence DESLANDES
 * @version 1.0
 */
public class Mission extends MissionAbs {
    
    /**
     * Identifiant de la mission.
     * @see Mission#setIDM(int) 
     * @see Mission#getIDM() 
     */
    private int idM;
    
    /**
     * Date de début de la mission.
     * @see Mission#setDateDebut(java.util.Date) 
     * @see Mission#getDateDebut() 
     */
    private Date dateDebut;
    
    private String descriptif;
    
    /**
     * Constructeur par défaut de la classe Mission.
     */
    private int idMission = 1;
    
    public Mission(){
    }
    
    /**
     * Constructeur de la classe Mission.
     * @param id
     *      Identifiant de la mission.
     * @param dd
     *      Date de début de la mission.
     * @see Mission#idM
     * @see Mission#dateDebut
     */
    public Mission(int id, Date dd)
    {
        this.idM=id;
        this.dateDebut=dd;
    }
    
     public Mission(int id, Date dd, String lib)
    {
        this.idM=id;
        this.dateDebut=dd;
        this.descriptif = lib;
    }
    
    /**
     * Setteur pour l'identifiant de la mission.
     * @param id 
     *      Identifiant de la mission
     * @see Mission#idM
     */
    public void setIDM(int id)
    {
        this.idM=id;
    }
    
    /**
     * Setteur pour la date de début de la mission.
     * @param d 
     *      Date de début de la mission.
     * @see Mission#dateDebut
     */
    public void setDateDebut(Date d)
    {
        this.dateDebut=d;
    }
    
    /**
     * Getteur pour l'identifiant de la mission.
     * @return L'identifiant de la mission.
     * @see Mission#idM
     */
    public int getIDM()
    {
        return this.idM;
    }

    /**
     * Getteur pour la date de début de mission.
     * @return La date du début de la mission.
     * @see Mission#dateDebut
     */
    public Date getDateDebut()
    {
        return this.dateDebut;
    }
    
    public String getDescriptif(){
        return this.descriptif;
    }
    
    public void setDescriptif(String lib){
        this.descriptif = lib;
    }
}
