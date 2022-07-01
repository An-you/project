package com.example.mes.template.vo;

import java.util.ArrayList;

public class EquipmentTemplateVO {
    int equipment_id;

    String name;

    ArrayList<String> attribute;

    int company_id;

    public int getEquipment_id() {
        return equipment_id;
    }

    public void setEquipment_id(int equipment_id) {
        this.equipment_id = equipment_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<String> getAttribute() {
        return attribute;
    }

    public void setAttribute(ArrayList<String> attribute) {
        this.attribute = attribute;
    }

    public int getCompany_id() {
        return company_id;
    }

    public void setCompany_id(int company_id) {
        this.company_id = company_id;
    }

    @Override
    public String toString() {
        return "EquipmentTemplateVO{" +
                "equipment_id=" + equipment_id +
                ", name='" + name + '\'' +
                ", attribute=" + attribute +
                ", company_id=" + company_id +
                '}';
    }
}