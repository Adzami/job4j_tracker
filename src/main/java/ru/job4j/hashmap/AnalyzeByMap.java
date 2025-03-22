package ru.job4j.hashmap;

import java.util.*;

public class AnalyzeByMap {
    public static double averageScore(List<Pupil> pupils) {
        int elements = 0;
        double totalScore = 0D;
        for (Pupil pupil : pupils) {
            for (Subject subject : pupil.subjects()) {
                totalScore += subject.score();
                elements++;
            }
        }
        return totalScore / elements;
    }

    public static List<Label> averageScoreByPupil(List<Pupil> pupils) {
        List<Label> result = new ArrayList<>();
        for (Pupil pupil : pupils) {
            int elements = 0;
            double pupilScore = 0D;
            for (Subject subject : pupil.subjects()) {
                pupilScore += subject.score();
                elements++;
            }
            result.add(new Label(pupil.name(), pupilScore / elements));
        }
        return result;
    }

    public static List<Label> averageScoreBySubject(List<Pupil> pupils) {
        Map<String, Integer> subjectResults = new LinkedHashMap<>();
        List<Label> result = new ArrayList<>();
        int elements = 0;
        for (Pupil pupil : pupils) {
            for (Subject subject : pupil.subjects()) {
                subjectResults.put(subject.name(), subjectResults.getOrDefault(subject.name(), 0) + subject.score());
            }
            elements++;
        }
        for (String subject : subjectResults.keySet()) {
            result.add(new Label(subject, (double) subjectResults.get(subject) / elements));
        }
        return result;
    }

    public static Label bestStudent(List<Pupil> pupils) {
        Label result = new Label("", 0D);
        for (Pupil pupil : pupils) {
            int totalScore = 0;
            for (Subject subject : pupil.subjects()) {
                totalScore += subject.score();
            }
            if (totalScore > result.score()) {
                result = new Label(pupil.name(), totalScore);
            }
        }
        return result;
    }

    public static Label bestSubject(List<Pupil> pupils) {
        Map<String, Integer> subjectResults = new LinkedHashMap<>();
        List<Label> result = new ArrayList<>();
        for (Pupil pupil : pupils) {
            for (Subject subject : pupil.subjects()) {
                subjectResults.put(subject.name(), subjectResults.getOrDefault(subject.name(), 0) + subject.score());
            }
        }
        for (String subject : subjectResults.keySet()) {
            result.add(new Label(subject, (double) subjectResults.get(subject)));
        }
        result.sort(Comparator.naturalOrder());
        return result.getLast();
    }
}