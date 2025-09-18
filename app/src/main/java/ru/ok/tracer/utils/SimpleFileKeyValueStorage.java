package ru.ok.tracer.utils;

import defpackage.AbstractC2141aT1;
import defpackage.AbstractC7096sn0;
import defpackage.C1518Tf1;
import defpackage.InterfaceC5908mZ;
import defpackage.LB;
import defpackage.O90;
import defpackage.RunnableC1577Tz0;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 72\u00020\u0001:\u00017B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u001b\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00010\u0007H\u0002¢\u0006\u0004\b\t\u0010\nJ!\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001H\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0012\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\b2\b\u0010\f\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0015\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\b2\b\u0010\f\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u0015\u0010\u0016J\u001f\u0010\u0018\u001a\u00020\u00012\u0006\u0010\u000b\u001a\u00020\b2\b\u0010\f\u001a\u0004\u0018\u00010\u0017¢\u0006\u0004\b\u0018\u0010\u0019J\u001f\u0010\u001b\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\b2\b\u0010\f\u001a\u0004\u0018\u00010\u001a¢\u0006\u0004\b\u001b\u0010\u001cJ\u001f\u0010\u001e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\b2\b\u0010\f\u001a\u0004\u0018\u00010\u001d¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010 \u001a\u0004\u0018\u00010\b2\u0006\u0010\u000b\u001a\u00020\b¢\u0006\u0004\b \u0010!J\u0017\u0010\"\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u000b\u001a\u00020\b¢\u0006\u0004\b\"\u0010#J\u0017\u0010$\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u000b\u001a\u00020\b¢\u0006\u0004\b$\u0010%J\u0017\u0010&\u001a\u0004\u0018\u00010\u001a2\u0006\u0010\u000b\u001a\u00020\b¢\u0006\u0004\b&\u0010'J\u0017\u0010(\u001a\u0004\u0018\u00010\u001d2\u0006\u0010\u000b\u001a\u00020\b¢\u0006\u0004\b(\u0010)J#\u0010+\u001a\u00020\r2\u0014\u0010*\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0007¢\u0006\u0004\b+\u0010,J\u0015\u0010-\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\b¢\u0006\u0004\b-\u0010.J\r\u0010/\u001a\u00020\r¢\u0006\u0004\b/\u0010\u0011R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u00100R-\u00106\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00010\u0007018BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b4\u00105¨\u00068"}, d2 = {"Lru/ok/tracer/utils/SimpleFileKeyValueStorage;", "", "Lkotlin/Function0;", "Ljava/io/File;", "fileSupplier", "<init>", "(LmZ;)V", "", "", "init", "()Ljava/util/Map;", "key", "value", "LTf1;", "putInternal", "(Ljava/lang/String;Ljava/lang/Object;)V", "writeMap", "()V", "putString", "(Ljava/lang/String;Ljava/lang/String;)V", "", "putBoolean", "(Ljava/lang/String;Ljava/lang/Boolean;)V", "", "putInt", "(Ljava/lang/String;Ljava/lang/Integer;)Ljava/lang/Object;", "", "putLong", "(Ljava/lang/String;Ljava/lang/Long;)V", "", "putFloat", "(Ljava/lang/String;Ljava/lang/Float;)V", "getString", "(Ljava/lang/String;)Ljava/lang/String;", "getBoolean", "(Ljava/lang/String;)Ljava/lang/Boolean;", "getInt", "(Ljava/lang/String;)Ljava/lang/Integer;", "getLong", "(Ljava/lang/String;)Ljava/lang/Long;", "getFloat", "(Ljava/lang/String;)Ljava/lang/Float;", "values", "putAll", "(Ljava/util/Map;)V", "remove", "(Ljava/lang/String;)V", "save", "LmZ;", "Ljava/util/concurrent/atomic/AtomicReference;", "map$delegate", "Lkotlin/Lazy;", "getMap", "()Ljava/util/concurrent/atomic/AtomicReference;", "map", "Companion", "tracer-commons_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes2.dex */
public final class SimpleFileKeyValueStorage {
    private static final Companion Companion = new Companion(null);

    @Deprecated
    private static final int LEGACY_TYPE_CONDITIONS = 7;

    @Deprecated
    private static final int TYPE_BOOLEAN = 2;

    @Deprecated
    private static final int TYPE_DOUBLE = 6;

    @Deprecated
    private static final int TYPE_FLOAT = 5;

    @Deprecated
    private static final int TYPE_INT = 3;

    @Deprecated
    private static final int TYPE_LONG = 4;

    @Deprecated
    private static final int TYPE_STRING = 1;

    @Deprecated
    private static final int VERSION = 1;
    private final InterfaceC5908mZ fileSupplier;

    /* renamed from: map$delegate, reason: from kotlin metadata */
    private final Lazy map;

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\u000bR\u0014\u0010\r\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\u000bR\u0014\u0010\u000e\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\u000bR\u0014\u0010\u000f\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\u000bR\u0014\u0010\u0010\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\u000bR\u0014\u0010\u0011\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0011\u0010\u000bR\u0014\u0010\u0012\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u000b¨\u0006\u0013"}, d2 = {"Lru/ok/tracer/utils/SimpleFileKeyValueStorage$Companion;", "", "<init>", "()V", "Ljava/io/DataInputStream;", "inStream", "LTf1;", "skipLegacyConditions", "(Ljava/io/DataInputStream;)V", "", "LEGACY_TYPE_CONDITIONS", "I", "TYPE_BOOLEAN", "TYPE_DOUBLE", "TYPE_FLOAT", "TYPE_INT", "TYPE_LONG", "TYPE_STRING", "VERSION", "tracer-commons_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void skipLegacyConditions(DataInputStream inStream) throws IOException {
            int i = inStream.readInt();
            int i2 = inStream.readInt();
            for (int i3 = 0; i3 < i2; i3++) {
                inStream.readUTF();
                inStream.readLong();
                inStream.readUTF();
                inStream.readUTF();
                inStream.readLong();
                if (i == 1) {
                    inStream.readInt();
                }
            }
        }

        private Companion() {
        }
    }

    public SimpleFileKeyValueStorage(InterfaceC5908mZ interfaceC5908mZ) {
        O90.f(interfaceC5908mZ, "fileSupplier");
        this.fileSupplier = interfaceC5908mZ;
        this.map = LB.b(new SimpleFileKeyValueStorage$map$2(this));
    }

    private final AtomicReference<Map<String, Object>> getMap() {
        return (AtomicReference) this.map.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00a9 A[LOOP:0: B:12:0x0035->B:27:0x00a9, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00ac A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.Map<java.lang.String, java.lang.Object> init() {
        /*
            r8 = this;
            NN r0 = defpackage.NN.a
            mZ r1 = r8.fileSupplier     // Catch: java.lang.Exception -> Lb7
            java.lang.Object r1 = r1.invoke()     // Catch: java.lang.Exception -> Lb7
            java.io.File r1 = (java.io.File) r1     // Catch: java.lang.Exception -> Lb7
            boolean r2 = r1.exists()     // Catch: java.lang.Exception -> Lb7
            if (r2 != 0) goto L11
            return r0
        L11:
            java.io.DataInputStream r2 = new java.io.DataInputStream     // Catch: java.lang.Exception -> Lb7
            java.io.BufferedInputStream r3 = new java.io.BufferedInputStream     // Catch: java.lang.Exception -> Lb7
            java.io.FileInputStream r4 = new java.io.FileInputStream     // Catch: java.lang.Exception -> Lb7
            r4.<init>(r1)     // Catch: java.lang.Exception -> Lb7
            r3.<init>(r4)     // Catch: java.lang.Exception -> Lb7
            r2.<init>(r3)     // Catch: java.lang.Exception -> Lb7
            int r1 = r2.readInt()     // Catch: java.lang.Throwable -> L5f
            r3 = 1
            if (r1 <= r3) goto L2a
            r4 = r0
            goto Lac
        L2a:
            int r1 = r2.readInt()     // Catch: java.lang.Throwable -> L5f
            java.util.LinkedHashMap r4 = new java.util.LinkedHashMap     // Catch: java.lang.Throwable -> L5f
            r4.<init>()     // Catch: java.lang.Throwable -> L5f
            if (r3 > r1) goto Lac
        L35:
            java.lang.String r5 = r2.readUTF()     // Catch: java.lang.Throwable -> L5f
            int r6 = r2.readInt()     // Catch: java.lang.Throwable -> L5f
            switch(r6) {
                case 1: goto L96;
                case 2: goto L8d;
                case 3: goto L84;
                case 4: goto L7b;
                case 5: goto L72;
                case 6: goto L69;
                case 7: goto L61;
                default: goto L40;
            }     // Catch: java.lang.Throwable -> L5f
        L40:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> L5f
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L5f
            r3.<init>()     // Catch: java.lang.Throwable -> L5f
            java.lang.String r4 = "Read unknown type "
            r3.append(r4)     // Catch: java.lang.Throwable -> L5f
            r3.append(r6)     // Catch: java.lang.Throwable -> L5f
            java.lang.String r4 = " with key "
            r3.append(r4)     // Catch: java.lang.Throwable -> L5f
            r3.append(r5)     // Catch: java.lang.Throwable -> L5f
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Throwable -> L5f
            r1.<init>(r3)     // Catch: java.lang.Throwable -> L5f
            throw r1     // Catch: java.lang.Throwable -> L5f
        L5f:
            r1 = move-exception
            goto Lb1
        L61:
            ru.ok.tracer.utils.SimpleFileKeyValueStorage$Companion r6 = ru.ok.tracer.utils.SimpleFileKeyValueStorage.Companion     // Catch: java.lang.Throwable -> L5f
            ru.ok.tracer.utils.SimpleFileKeyValueStorage.Companion.access$skipLegacyConditions(r6, r2)     // Catch: java.lang.Throwable -> L5f
            Tf1 r6 = defpackage.C1518Tf1.a     // Catch: java.lang.Throwable -> L5f
            goto L9a
        L69:
            double r6 = r2.readDouble()     // Catch: java.lang.Throwable -> L5f
            java.lang.Double r6 = java.lang.Double.valueOf(r6)     // Catch: java.lang.Throwable -> L5f
            goto L9a
        L72:
            float r6 = r2.readFloat()     // Catch: java.lang.Throwable -> L5f
            java.lang.Float r6 = java.lang.Float.valueOf(r6)     // Catch: java.lang.Throwable -> L5f
            goto L9a
        L7b:
            long r6 = r2.readLong()     // Catch: java.lang.Throwable -> L5f
            java.lang.Long r6 = java.lang.Long.valueOf(r6)     // Catch: java.lang.Throwable -> L5f
            goto L9a
        L84:
            int r6 = r2.readInt()     // Catch: java.lang.Throwable -> L5f
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch: java.lang.Throwable -> L5f
            goto L9a
        L8d:
            boolean r6 = r2.readBoolean()     // Catch: java.lang.Throwable -> L5f
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)     // Catch: java.lang.Throwable -> L5f
            goto L9a
        L96:
            java.lang.String r6 = r2.readUTF()     // Catch: java.lang.Throwable -> L5f
        L9a:
            java.lang.String r7 = "when (typeInt) {\n       …y\")\n                    }"
            defpackage.O90.e(r6, r7)     // Catch: java.lang.Throwable -> L5f
            java.lang.String r7 = "key"
            defpackage.O90.e(r5, r7)     // Catch: java.lang.Throwable -> L5f
            r4.put(r5, r6)     // Catch: java.lang.Throwable -> L5f
            if (r3 == r1) goto Lac
            int r3 = r3 + 1
            goto L35
        Lac:
            r1 = 0
            defpackage.AbstractC2141aT1.a(r2, r1)     // Catch: java.lang.Exception -> Lb7
            return r4
        Lb1:
            throw r1     // Catch: java.lang.Throwable -> Lb2
        Lb2:
            r3 = move-exception
            defpackage.AbstractC2141aT1.a(r2, r1)     // Catch: java.lang.Exception -> Lb7
            throw r3     // Catch: java.lang.Exception -> Lb7
        Lb7:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.ok.tracer.utils.SimpleFileKeyValueStorage.init():java.util.Map");
    }

    private final void putInternal(String key, Object value) {
        AtomicReference<Map<String, Object>> map = getMap();
        while (true) {
            Map<String, Object> map2 = map.get();
            O90.e(map2, "oldOne");
            LinkedHashMap linkedHashMapQ = AbstractC7096sn0.q(map2);
            if (value == null) {
                linkedHashMapQ.remove(key);
            } else {
                linkedHashMapQ.put(key, value);
            }
            while (!map.compareAndSet(map2, linkedHashMapQ)) {
                if (map.get() != map2) {
                    break;
                }
            }
            return;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void writeMap() {
        try {
            Map<String, Object> map = getMap().get();
            O90.e(map, "map.get()");
            Map mapO = AbstractC7096sn0.o(map);
            DataOutputStream dataOutputStream = new DataOutputStream(new BufferedOutputStream(new FileOutputStream((File) this.fileSupplier.invoke())));
            try {
                dataOutputStream.writeInt(1);
                dataOutputStream.writeInt(mapO.size());
                for (Map.Entry entry : mapO.entrySet()) {
                    dataOutputStream.writeUTF((String) entry.getKey());
                    Object value = entry.getValue();
                    if (value instanceof Boolean) {
                        dataOutputStream.writeInt(2);
                        dataOutputStream.writeBoolean(((Boolean) value).booleanValue());
                    } else if (value instanceof Integer) {
                        dataOutputStream.writeInt(3);
                        dataOutputStream.writeInt(((Number) value).intValue());
                    } else if (value instanceof Long) {
                        dataOutputStream.writeInt(4);
                        dataOutputStream.writeLong(((Number) value).longValue());
                    } else if (value instanceof Float) {
                        dataOutputStream.writeInt(5);
                        dataOutputStream.writeFloat(((Number) value).floatValue());
                    } else if (value instanceof Double) {
                        dataOutputStream.writeInt(6);
                        dataOutputStream.writeDouble(((Number) value).doubleValue());
                    } else {
                        if (!(value instanceof String)) {
                            throw new IllegalArgumentException("Write unknown type of value " + value);
                        }
                        dataOutputStream.writeInt(1);
                        dataOutputStream.writeUTF((String) value);
                    }
                }
                AbstractC2141aT1.a(dataOutputStream, null);
            } finally {
            }
        } catch (Exception unused) {
        }
    }

    public final Boolean getBoolean(String key) {
        O90.f(key, "key");
        return (Boolean) getMap().get().get(key);
    }

    public final Float getFloat(String key) {
        O90.f(key, "key");
        return (Float) getMap().get().get(key);
    }

    public final Integer getInt(String key) {
        O90.f(key, "key");
        return (Integer) getMap().get().get(key);
    }

    public final Long getLong(String key) {
        O90.f(key, "key");
        return (Long) getMap().get().get(key);
    }

    public final String getString(String key) {
        O90.f(key, "key");
        return (String) getMap().get().get(key);
    }

    public final void putAll(Map<String, ? extends Object> values) {
        O90.f(values, "values");
        AtomicReference<Map<String, Object>> map = getMap();
        while (true) {
            Map<String, Object> map2 = map.get();
            O90.e(map2, "oldOne");
            LinkedHashMap linkedHashMapQ = AbstractC7096sn0.q(map2);
            for (Map.Entry<String, ? extends Object> entry : values.entrySet()) {
                String key = entry.getKey();
                Object value = entry.getValue();
                if (value == null) {
                    linkedHashMapQ.remove(key);
                } else {
                    linkedHashMapQ.put(key, value);
                }
            }
            while (!map.compareAndSet(map2, linkedHashMapQ)) {
                if (map.get() != map2) {
                    break;
                }
            }
            return;
        }
    }

    public final void putBoolean(String key, Boolean value) {
        O90.f(key, "key");
        putInternal(key, value);
    }

    public final void putFloat(String key, Float value) {
        O90.f(key, "key");
        putInternal(key, value);
    }

    public final Object putInt(String key, Integer value) {
        O90.f(key, "key");
        putInternal(key, value);
        return C1518Tf1.a;
    }

    public final void putLong(String key, Long value) {
        O90.f(key, "key");
        putInternal(key, value);
    }

    public final void putString(String key, String value) {
        O90.f(key, "key");
        putInternal(key, value);
    }

    public final void remove(String key) {
        O90.f(key, "key");
        AtomicReference<Map<String, Object>> map = getMap();
        while (true) {
            Map<String, Object> map2 = map.get();
            O90.e(map2, "oldOne");
            LinkedHashMap linkedHashMapQ = AbstractC7096sn0.q(map2);
            linkedHashMapQ.remove(key);
            while (!map.compareAndSet(map2, linkedHashMapQ)) {
                if (map.get() != map2) {
                    break;
                }
            }
            return;
        }
    }

    public final void save() {
        TracerThreads.INSTANCE.runInBgSequential(new RunnableC1577Tz0(27, this));
    }
}
