package interfaces;

import fs.answer.FsApi;

public interface Question {

    String formQuestion(String num, String place, String coordinats);

    String getAnswer();

    FsApi treatmentAnswer();
}