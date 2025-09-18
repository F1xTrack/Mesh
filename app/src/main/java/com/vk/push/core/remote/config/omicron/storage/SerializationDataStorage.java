package com.vk.push.core.remote.config.omicron.storage;

import android.util.AtomicFile;
import android.util.Base64;
import com.vk.push.core.remote.config.omicron.AnalyticsHandler;
import com.vk.push.core.remote.config.omicron.Data;
import com.vk.push.core.remote.config.omicron.DataId;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.nio.charset.StandardCharsets;
import java.util.Map;

/* loaded from: classes2.dex */
public class SerializationDataStorage implements DataStorage {
    public final File a;
    public final AnalyticsHandler b;

    public static final class Entry implements Serializable {
        private static final long serialVersionUID = -8081595521982232763L;
        final String condition;
        final Map<String, Object> pairs;
        final Map<String, String> segments;
        final Integer version;

        public Entry(Data data) {
            this.version = data.getVersion();
            this.condition = data.getCondition();
            this.pairs = data.getAll();
            this.segments = data.getSegments();
        }
    }

    public SerializationDataStorage(File file, AnalyticsHandler analyticsHandler) {
        this.a = file;
        this.b = analyticsHandler;
    }

    public final synchronized File a(DataId dataId) {
        return new File(this.a, Base64.encodeToString((dataId.getAppId() + dataId.getUrl()).getBytes(StandardCharsets.UTF_8), 3));
    }

    @Override // com.vk.push.core.remote.config.omicron.storage.DataStorage
    public synchronized void clearData() {
        File[] fileArrListFiles = this.a.listFiles();
        if (fileArrListFiles != null) {
            for (File file : fileArrListFiles) {
                if (file != null) {
                    file.delete();
                }
            }
        }
    }

    @Override // com.vk.push.core.remote.config.omicron.storage.DataStorage
    public synchronized Data getData(DataId dataId) {
        File fileA = a(dataId);
        if (!fileA.exists()) {
            return null;
        }
        try {
            ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(fileA));
            try {
                Entry entry = (Entry) objectInputStream.readObject();
                Data.Builder builderSegments = Data.newBuilder().version(entry.version).condition(entry.condition).segments(entry.segments);
                for (Map.Entry<String, Object> entry2 : entry.pairs.entrySet()) {
                    builderSegments.pair(entry2.getKey(), entry2.getValue());
                }
                Data dataBuild = builderSegments.build();
                objectInputStream.close();
                return dataBuild;
            } catch (Throwable th) {
                try {
                    objectInputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (ClassCastException e) {
            e = e;
            clearData();
            this.b.onGetDataError(e, "Data is cleared");
            return null;
        } catch (IllegalArgumentException e2) {
            e = e2;
            clearData();
            this.b.onGetDataError(e, "Data is cleared");
            return null;
        } catch (Exception e3) {
            this.b.onGetDataError(e3, "Data is not cleared");
            return null;
        } catch (OutOfMemoryError e4) {
            e = e4;
            clearData();
            this.b.onGetDataError(e, "Data is cleared");
            return null;
        }
    }

    @Override // com.vk.push.core.remote.config.omicron.storage.DataStorage
    public synchronized void putData(DataId dataId, Data data) {
        FileOutputStream fileOutputStreamStartWrite;
        Entry entry = new Entry(data);
        AtomicFile atomicFile = new AtomicFile(a(dataId));
        try {
            fileOutputStreamStartWrite = atomicFile.startWrite();
        } catch (IOException unused) {
            fileOutputStreamStartWrite = null;
        }
        if (fileOutputStreamStartWrite != null) {
            try {
                ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStreamStartWrite);
                try {
                    objectOutputStream.writeObject(entry);
                    atomicFile.finishWrite(fileOutputStreamStartWrite);
                    objectOutputStream.close();
                } catch (Throwable th) {
                    try {
                        objectOutputStream.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } catch (IOException unused2) {
                atomicFile.failWrite(fileOutputStreamStartWrite);
            }
        }
    }
}
