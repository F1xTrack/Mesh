package defpackage;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.GuardedResultAsyncTask;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.UUID;

/* loaded from: classes2.dex */
public final class AH0 extends GuardedResultAsyncTask {
    public final WeakReference a;
    public final ArrayList b;
    public final String c;
    public final Promise d;

    public AH0(ReactApplicationContext reactApplicationContext, ArrayList arrayList, String str, Promise promise) {
        super(reactApplicationContext.getExceptionHandler());
        this.a = new WeakReference(reactApplicationContext.getApplicationContext());
        this.b = arrayList;
        this.c = str;
        this.d = promise;
    }

    public static Uri a(Context context, Uri uri, File file) throws IOException {
        InputStream inputStreamOpenInputStream = context.getContentResolver().openInputStream(uri);
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            try {
                byte[] bArr = new byte[8192];
                while (true) {
                    int i = inputStreamOpenInputStream.read(bArr);
                    if (i <= 0) {
                        Uri uriFromFile = Uri.fromFile(file);
                        fileOutputStream.close();
                        inputStreamOpenInputStream.close();
                        return uriFromFile;
                    }
                    fileOutputStream.write(bArr, 0, i);
                }
            } finally {
            }
        } catch (Throwable th) {
            if (inputStreamOpenInputStream != null) {
                try {
                    inputStreamOpenInputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    @Override // com.facebook.react.bridge.GuardedResultAsyncTask
    public final Object doInBackgroundGuarded() throws IOException {
        WritableMap writableMapCreateMap;
        WritableArray writableArrayCreateArray = Arguments.createArray();
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            Uri uri = (Uri) it.next();
            Context context = (Context) this.a.get();
            if (context == null) {
                writableMapCreateMap = Arguments.createMap();
            } else {
                ContentResolver contentResolver = context.getContentResolver();
                WritableMap writableMapCreateMap2 = Arguments.createMap();
                writableMapCreateMap2.putString("uri", uri.toString());
                writableMapCreateMap2.putString("type", contentResolver.getType(uri));
                Cursor cursorQuery = contentResolver.query(uri, null, null, null, null, null);
                if (cursorQuery != null) {
                    try {
                        if (cursorQuery.moveToFirst()) {
                            int columnIndex = cursorQuery.getColumnIndex("_display_name");
                            if (cursorQuery.isNull(columnIndex)) {
                                writableMapCreateMap2.putNull("name");
                            } else {
                                writableMapCreateMap2.putString("name", cursorQuery.getString(columnIndex));
                            }
                            int columnIndex2 = cursorQuery.getColumnIndex("mime_type");
                            if (!cursorQuery.isNull(columnIndex2)) {
                                writableMapCreateMap2.putString("type", cursorQuery.getString(columnIndex2));
                            }
                            if (cursorQuery.isNull(cursorQuery.getColumnIndex("_size"))) {
                                writableMapCreateMap2.putNull("size");
                            } else {
                                writableMapCreateMap2.putDouble("size", cursorQuery.getLong(r5));
                            }
                        }
                    } catch (Throwable th) {
                        try {
                            cursorQuery.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                }
                if (cursorQuery != null) {
                    cursorQuery.close();
                }
                String str = this.c;
                if (str == null) {
                    writableMapCreateMap2.putNull("fileCopyUri");
                } else {
                    File cacheDir = context.getCacheDir();
                    if (str.equals("documentDirectory")) {
                        cacheDir = context.getFilesDir();
                    }
                    File file = new File(cacheDir, UUID.randomUUID().toString());
                    try {
                        if (!file.mkdir()) {
                            throw new IOException("failed to create directory at " + file.getAbsolutePath());
                        }
                        String string = writableMapCreateMap2.getString("name");
                        if (string == null) {
                            string = String.valueOf(System.currentTimeMillis());
                        }
                        File file2 = new File(file, string);
                        if (!file2.getCanonicalPath().startsWith(file.getCanonicalPath())) {
                            throw new IllegalArgumentException("The copied file is attempting to write outside of the target directory.");
                        }
                        writableMapCreateMap2.putString("fileCopyUri", a(context, uri, file2).toString());
                    } catch (Exception e) {
                        e.printStackTrace();
                        writableMapCreateMap2.putNull("fileCopyUri");
                        writableMapCreateMap2.putString("copyError", e.getLocalizedMessage());
                    }
                }
                writableMapCreateMap = writableMapCreateMap2;
            }
            writableArrayCreateArray.pushMap(writableMapCreateMap);
        }
        return writableArrayCreateArray;
    }

    @Override // com.facebook.react.bridge.GuardedResultAsyncTask
    public final void onPostExecuteGuarded(Object obj) {
        this.d.resolve((ReadableArray) obj);
    }
}
