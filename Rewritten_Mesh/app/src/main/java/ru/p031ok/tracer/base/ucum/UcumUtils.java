package ru.p031ok.tracer.base.ucum;

import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import p000.C6838sg;
import p000.O90;

@Metadata(m22266d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\b\u001a\u00020\u0001*\u00020\t\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0004\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0005\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0006\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0007\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000¨\u0006\n"}, m22267d2 = {"UCUM_DAYS", "", "UCUM_HOURS", "UCUM_MICROSECONDS", "UCUM_MILLISECODS", "UCUM_MINUTES", "UCUM_NANOSECONDS", "UCUM_SECONDS", "getToUcumString", "Ljava/util/concurrent/TimeUnit;", "tracer-base_release"}, m22268k = 2, m22269mv = {1, 7, 1}, m22271xi = 48)
/* loaded from: classes2.dex */
public final class UcumUtils {
    public static final String UCUM_DAYS = "d";
    public static final String UCUM_HOURS = "h";
    public static final String UCUM_MICROSECONDS = "us";
    public static final String UCUM_MILLISECODS = "ms";
    public static final String UCUM_MINUTES = "min";
    public static final String UCUM_NANOSECONDS = "ns";
    public static final String UCUM_SECONDS = "s";

    @Metadata(m22268k = 3, m22269mv = {1, 7, 1}, m22271xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[TimeUnit.values().length];
            try {
                iArr[TimeUnit.NANOSECONDS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TimeUnit.MICROSECONDS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[TimeUnit.MILLISECONDS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[TimeUnit.SECONDS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[TimeUnit.MINUTES.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[TimeUnit.HOURS.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[TimeUnit.DAYS.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final String getToUcumString(TimeUnit timeUnit) {
        O90.m5968f(timeUnit, "<this>");
        switch (WhenMappings.$EnumSwitchMapping$0[timeUnit.ordinal()]) {
            case 1:
                return UCUM_NANOSECONDS;
            case 2:
                return UCUM_MICROSECONDS;
            case 3:
                return UCUM_MILLISECODS;
            case 4:
                return UCUM_SECONDS;
            case 5:
                return "min";
            case 6:
                return UCUM_HOURS;
            case 7:
                return UCUM_DAYS;
            default:
                throw new C6838sg();
        }
    }
}
