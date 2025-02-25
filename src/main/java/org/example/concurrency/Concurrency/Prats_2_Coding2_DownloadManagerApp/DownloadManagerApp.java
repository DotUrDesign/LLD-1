package org.example.concurrency.Concurrency.Prats_2_Coding2_DownloadManagerApp;

import java.util.List;

/*

CODING PROLEM 2 : DOWNLOAD MANAGER

Consider a simple download manager application that needs to download multiple files
concurrently. Implement the download manager using the Java Executor Framework.
Requirements:
The download manager should be able to download multiple files simultaneously.
Each file download is an independent task that can be executed concurrently.
The download manager should use a thread pool from the Executor Framework to
manage and execute the download tasks.
Implement a mechanism to track the progress of each download task and display
it to the user.

 */
public class DownloadManagerApp {

    public static void main(String[] args) {
        DownloadManager downloadManager = new DownloadManager(3);
        List<String> fileToDownload = List.of("file1", "file2", "file3", "file4",
                "file5");
        downloadManager.downloadFiles(fileToDownload);

    }
}
