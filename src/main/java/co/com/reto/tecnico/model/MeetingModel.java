package co.com.reto.tecnico.model;

public class MeetingModel {
    private String strNameBusiness;
    private String strParentUnit;
    private String nameMeeting;
    private String numberMeeting;
    private String type;
    private String fechaInicio;
    private String hourStart;
    private String endDate;
    private String endHour;
    private String organizedBy;
    private String location;
    private String reporter;
    private String attendee;

    public String getAttendee() {
        return attendee;
    }

    public void setAttendee(String attendee) {
        this.attendee = attendee;
    }

    public String getOrganizedBy() {
        return organizedBy;
    }

    public void setOrganizedBy(String organizedBy) {
        this.organizedBy = organizedBy;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getReporter() {
        return reporter;
    }

    public void setReporter(String reporter) {
        this.reporter = reporter;
    }

    public String getEndHour() {
        return endHour;
    }

    public void setEndHour(String endHour) {
        this.endHour = endHour;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public String getFechaInicio() {
        return fechaInicio;
    }

    public String getHourStart() {
        return hourStart;
    }

    public void setHourStart(String hourStart) {
        this.hourStart = hourStart;
    }

    public void setFechaInicio(String fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public String getStrNameBusiness() {
        return strNameBusiness;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setStrNameBusiness(String strNameBusiness) {
        this.strNameBusiness = strNameBusiness;
    }

    public String getStrParentUnit() {
        return strParentUnit;
    }

    public void setStrParentUnit(String strParentUnit) {
        this.strParentUnit = strParentUnit;
    }

    public String getNameMeeting() {
        return nameMeeting;
    }

    public void setNameMeeting(String nameMeeting) {
        this.nameMeeting = nameMeeting;
    }

    public String getNumberMeeting() {
        return numberMeeting;
    }

    public void setNumberMeeting(String numberMeeting) {
        this.numberMeeting = numberMeeting;
    }
}
