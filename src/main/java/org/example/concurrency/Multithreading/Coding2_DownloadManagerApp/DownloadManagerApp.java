package org.example.concurrency.Multithreading.Coding2_DownloadManagerApp;

import java.util.List;

public class DownloadManagerApp {

    public static void main(String[] args) {
        DownloadManager downloadManager = new DownloadManager(3);
        List<String> fileToDownload = List.of("file1", "file2", "file3", "file4",
                "file5");
        downloadManager.downloadFiles(fileToDownload);

    }
}
