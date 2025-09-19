package io.legere.pdfiumandroid.util;

import androidx.annotation.Keep;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import p000.F02;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Keep
@Metadata(m22266d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, m22267d2 = {"Lio/legere/pdfiumandroid/util/AlreadyClosedBehavior;", "", "<init>", "(Ljava/lang/String;I)V", "EXCEPTION", "IGNORE", "pdfiumandroid_release"}, m22268k = 1, m22269mv = {2, 0, 0}, m22271xi = 48)
/* loaded from: classes2.dex */
public final class AlreadyClosedBehavior {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ AlreadyClosedBehavior[] $VALUES;
    public static final AlreadyClosedBehavior EXCEPTION = new AlreadyClosedBehavior("EXCEPTION", 0);
    public static final AlreadyClosedBehavior IGNORE = new AlreadyClosedBehavior("IGNORE", 1);

    private static final /* synthetic */ AlreadyClosedBehavior[] $values() {
        return new AlreadyClosedBehavior[]{EXCEPTION, IGNORE};
    }

    static {
        AlreadyClosedBehavior[] alreadyClosedBehaviorArr$values = $values();
        $VALUES = alreadyClosedBehaviorArr$values;
        $ENTRIES = F02.m2482c(alreadyClosedBehaviorArr$values);
    }

    private AlreadyClosedBehavior(String str, int i) {
    }

    public static EnumEntries getEntries() {
        return $ENTRIES;
    }

    public static AlreadyClosedBehavior valueOf(String str) {
        return (AlreadyClosedBehavior) Enum.valueOf(AlreadyClosedBehavior.class, str);
    }

    public static AlreadyClosedBehavior[] values() {
        return (AlreadyClosedBehavior[]) $VALUES.clone();
    }
}
