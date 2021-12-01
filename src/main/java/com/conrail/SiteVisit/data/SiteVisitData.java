package com.conrail.SiteVisit.data;

import com.conrail.SiteVisit.models.SiteVisit;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class SiteVisitData {

    private static final Map<Integer, SiteVisit> SiteVisits = new HashMap<>();

    public static Collection<SiteVisit> getAll() {
        return SiteVisits.values();
    }

    public static SiteVisit getById(int id) {
        return SiteVisits.get(id);
    }

    public static void add(SiteVisit siteVisit) {
        SiteVisits.put(siteVisit.getId(), siteVisit);
    }

    public static void remove(int id) {
        SiteVisits.remove(id);
    }

//    public static void save(SiteVisit siteVisit){SiteVisits.replace(siteVisit.getId(), siteVisit);}
}
