package org.mozilla.focus.provider;

import android.net.Uri;
import android.provider.BaseColumns;

import org.mozilla.focus.BuildConfig;

/**
 * Created by anlin on 17/08/2017.
 */

public class DownloadContract {
    public static final String AUTHORITY = BuildConfig.APPLICATION_ID + ".provider.downloadprovider";
    public static final Uri AUTHORITY_URI = Uri.parse("content://" + AUTHORITY);
    public static final String PATH = "download_info";
    public static final int CODE = 2;

    public static final class Download implements BaseColumns{
        private  Download(){};

        public static final Uri CONTENT_URI = Uri.withAppendedPath(AUTHORITY_URI, "download_info");

        public static final String CONTENT_TYPE = "vnd.android.cursor.dir/vnd." + BuildConfig.APPLICATION_ID + ".provider.downloadprovider.downloadinfo";

        public static final String TABLE_DOWNLOAD = "download_info";
        public static final String DOWNLOAD_ID = "download_id";
        public static final String FILE_NAME = "file_name";

    }
}
