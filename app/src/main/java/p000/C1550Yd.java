package p000;

import android.util.JsonReader;
import android.util.JsonToken;
import java.io.BufferedReader;
import java.io.IOException;

/* renamed from: Yd */
/* loaded from: classes.dex */
public final class C1550Yd {

    /* renamed from: a */
    public final long f14395a;

    public C1550Yd(long j) {
        this.f14395a = j;
    }

    /* renamed from: a */
    public static C1550Yd m9324a(BufferedReader bufferedReader) throws IOException {
        JsonReader jsonReader = new JsonReader(bufferedReader);
        try {
            jsonReader.beginObject();
            while (jsonReader.hasNext()) {
                if (jsonReader.nextName().equals("nextRequestWaitMillis")) {
                    return jsonReader.peek() == JsonToken.STRING ? new C1550Yd(Long.parseLong(jsonReader.nextString())) : new C1550Yd(jsonReader.nextLong());
                }
                jsonReader.skipValue();
            }
            throw new IOException("Response is missing nextRequestWaitMillis field.");
        } finally {
            jsonReader.close();
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C1550Yd) {
            return this.f14395a == ((C1550Yd) obj).f14395a;
        }
        return false;
    }

    public final int hashCode() {
        long j = this.f14395a;
        return ((int) ((j >>> 32) ^ j)) ^ 1000003;
    }

    public final String toString() {
        return AbstractC0852NX.m5760i(new StringBuilder("LogResponse{nextRequestWaitMillis="), this.f14395a, "}");
    }
}
