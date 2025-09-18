package p000;

import java.io.IOException;

/* renamed from: lF1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C10114lF1 extends IOException {

    /* renamed from: a */
    public static final /* synthetic */ int f36988a = 0;

    /* renamed from: a */
    public static C10114lF1 m22372a() {
        return new C10114lF1("Protocol message had invalid UTF-8.");
    }

    /* renamed from: b */
    public static C10114lF1 m22373b() {
        return new C10114lF1("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    /* renamed from: c */
    public static C10114lF1 m22374c() {
        return new C10114lF1("Failed to parse the message.");
    }

    /* renamed from: d */
    public static C10114lF1 m22375d() {
        return new C10114lF1("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }
}
