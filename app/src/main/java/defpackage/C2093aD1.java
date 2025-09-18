package defpackage;

import android.app.PendingIntent;
import android.content.Intent;
import android.graphics.Point;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.emoji2.text.flatbuffer.FlexBuffers;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.ClientIdentity;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.location.LocationRequest;
import com.yandex.varioqub.config.model.ConfigValue;
import io.appmetrica.analytics.impl.C4473c9;
import java.util.ArrayList;

/* renamed from: aD1 */
/* loaded from: classes.dex */
public final class C2093aD1 implements Parcelable.Creator {
    public final /* synthetic */ int a;

    public /* synthetic */ C2093aD1(int i) {
        this.a = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v51, types: [java.util.ArrayList] */
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        C7142t12 c7142t12;
        double d = ConfigValue.DOUBLE_DEFAULT_VALUE;
        long j = 0;
        int i = 0;
        String strCreateString = null;
        String strCreateString2 = null;
        AY1 ay1 = null;
        String[] strArrCreateStringArray = null;
        String strCreateString3 = null;
        String strCreateString4 = null;
        String strCreateString5 = null;
        ArrayList arrayListCreateTypedList = null;
        ArrayList<Integer> arrayListCreateIntegerList = null;
        String strCreateString6 = null;
        String[] strArrCreateStringArray2 = null;
        Status status = null;
        String strCreateString7 = null;
        switch (this.a) {
            case 0:
                int iValidateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
                long j2 = 0;
                int i2 = 0;
                int i3 = 0;
                int i4 = 0;
                int i5 = 0;
                while (parcel.dataPosition() < iValidateObjectHeader) {
                    int header = SafeParcelReader.readHeader(parcel);
                    int fieldId = SafeParcelReader.getFieldId(header);
                    if (fieldId == 1) {
                        i2 = SafeParcelReader.readInt(parcel, header);
                    } else if (fieldId == 2) {
                        i3 = SafeParcelReader.readInt(parcel, header);
                    } else if (fieldId == 3) {
                        i4 = SafeParcelReader.readInt(parcel, header);
                    } else if (fieldId == 4) {
                        i5 = SafeParcelReader.readInt(parcel, header);
                    } else if (fieldId != 5) {
                        SafeParcelReader.skipUnknownField(parcel, header);
                    } else {
                        j2 = SafeParcelReader.readLong(parcel, header);
                    }
                }
                SafeParcelReader.ensureAtEnd(parcel, iValidateObjectHeader);
                return new WC1(i2, i3, j2, i4, i5);
            case 1:
                int iValidateObjectHeader2 = SafeParcelReader.validateObjectHeader(parcel);
                while (parcel.dataPosition() < iValidateObjectHeader2) {
                    int header2 = SafeParcelReader.readHeader(parcel);
                    int fieldId2 = SafeParcelReader.getFieldId(header2);
                    if (fieldId2 == 1) {
                        strCreateString = SafeParcelReader.createString(parcel, header2);
                    } else if (fieldId2 != 2) {
                        SafeParcelReader.skipUnknownField(parcel, header2);
                    } else {
                        i = SafeParcelReader.readInt(parcel, header2);
                    }
                }
                SafeParcelReader.ensureAtEnd(parcel, iValidateObjectHeader2);
                return new PC1(strCreateString, i);
            case 2:
                int iValidateObjectHeader3 = SafeParcelReader.validateObjectHeader(parcel);
                int i6 = 0;
                IBinder iBinder = null;
                IBinder iBinder2 = null;
                PendingIntent pendingIntent = null;
                String strCreateString8 = null;
                String strCreateString9 = null;
                while (parcel.dataPosition() < iValidateObjectHeader3) {
                    int header3 = SafeParcelReader.readHeader(parcel);
                    switch (SafeParcelReader.getFieldId(header3)) {
                        case 1:
                            i6 = SafeParcelReader.readInt(parcel, header3);
                            break;
                        case 2:
                            iBinder = SafeParcelReader.readIBinder(parcel, header3);
                            break;
                        case 3:
                            iBinder2 = SafeParcelReader.readIBinder(parcel, header3);
                            break;
                        case 4:
                            pendingIntent = (PendingIntent) SafeParcelReader.createParcelable(parcel, header3, PendingIntent.CREATOR);
                            break;
                        case 5:
                            strCreateString8 = SafeParcelReader.createString(parcel, header3);
                            break;
                        case 6:
                            strCreateString9 = SafeParcelReader.createString(parcel, header3);
                            break;
                        default:
                            SafeParcelReader.skipUnknownField(parcel, header3);
                            break;
                    }
                }
                SafeParcelReader.ensureAtEnd(parcel, iValidateObjectHeader3);
                return new BE1(i6, iBinder, iBinder2, pendingIntent, strCreateString8, strCreateString9);
            case 3:
                int iValidateObjectHeader4 = SafeParcelReader.validateObjectHeader(parcel);
                long j3 = Long.MAX_VALUE;
                boolean z = false;
                boolean z2 = false;
                boolean z3 = false;
                boolean z4 = false;
                LocationRequest locationRequest = null;
                ArrayList arrayListCreateTypedList2 = null;
                String strCreateString10 = null;
                String strCreateString11 = null;
                while (parcel.dataPosition() < iValidateObjectHeader4) {
                    int header4 = SafeParcelReader.readHeader(parcel);
                    int fieldId3 = SafeParcelReader.getFieldId(header4);
                    if (fieldId3 == 1) {
                        locationRequest = (LocationRequest) SafeParcelReader.createParcelable(parcel, header4, LocationRequest.CREATOR);
                    } else if (fieldId3 != 5) {
                        switch (fieldId3) {
                            case 8:
                                z = SafeParcelReader.readBoolean(parcel, header4);
                                break;
                            case 9:
                                z2 = SafeParcelReader.readBoolean(parcel, header4);
                                break;
                            case 10:
                                strCreateString10 = SafeParcelReader.createString(parcel, header4);
                                break;
                            case 11:
                                z3 = SafeParcelReader.readBoolean(parcel, header4);
                                break;
                            case 12:
                                z4 = SafeParcelReader.readBoolean(parcel, header4);
                                break;
                            case 13:
                                strCreateString11 = SafeParcelReader.createString(parcel, header4);
                                break;
                            case 14:
                                j3 = SafeParcelReader.readLong(parcel, header4);
                                break;
                            default:
                                SafeParcelReader.skipUnknownField(parcel, header4);
                                break;
                        }
                    } else {
                        arrayListCreateTypedList2 = SafeParcelReader.createTypedList(parcel, header4, ClientIdentity.CREATOR);
                    }
                }
                SafeParcelReader.ensureAtEnd(parcel, iValidateObjectHeader4);
                return new FE1(locationRequest, arrayListCreateTypedList2, z, z2, strCreateString10, z3, z4, strCreateString11, j3);
            case 4:
                int iValidateObjectHeader5 = SafeParcelReader.validateObjectHeader(parcel);
                int i7 = 1;
                FE1 fe1 = null;
                IBinder iBinder3 = null;
                IBinder iBinder4 = null;
                PendingIntent pendingIntent2 = null;
                IBinder iBinder5 = null;
                String strCreateString12 = null;
                while (parcel.dataPosition() < iValidateObjectHeader5) {
                    int header5 = SafeParcelReader.readHeader(parcel);
                    switch (SafeParcelReader.getFieldId(header5)) {
                        case 1:
                            i7 = SafeParcelReader.readInt(parcel, header5);
                            break;
                        case 2:
                            fe1 = (FE1) SafeParcelReader.createParcelable(parcel, header5, FE1.CREATOR);
                            break;
                        case 3:
                            iBinder3 = SafeParcelReader.readIBinder(parcel, header5);
                            break;
                        case 4:
                            pendingIntent2 = (PendingIntent) SafeParcelReader.createParcelable(parcel, header5, PendingIntent.CREATOR);
                            break;
                        case 5:
                            iBinder4 = SafeParcelReader.readIBinder(parcel, header5);
                            break;
                        case 6:
                            iBinder5 = SafeParcelReader.readIBinder(parcel, header5);
                            break;
                        case 7:
                        default:
                            SafeParcelReader.skipUnknownField(parcel, header5);
                            break;
                        case 8:
                            strCreateString12 = SafeParcelReader.createString(parcel, header5);
                            break;
                    }
                }
                SafeParcelReader.ensureAtEnd(parcel, iValidateObjectHeader5);
                return new LE1(i7, fe1, iBinder3, iBinder4, pendingIntent2, iBinder5, strCreateString12);
            case 5:
                int iValidateObjectHeader6 = SafeParcelReader.validateObjectHeader(parcel);
                float f = 0.0f;
                double d2 = 0.0d;
                double d3 = 0.0d;
                int i8 = -1;
                long j4 = 0;
                int i9 = 0;
                short s = 0;
                int i10 = 0;
                String strCreateString13 = null;
                while (parcel.dataPosition() < iValidateObjectHeader6) {
                    int header6 = SafeParcelReader.readHeader(parcel);
                    switch (SafeParcelReader.getFieldId(header6)) {
                        case 1:
                            strCreateString13 = SafeParcelReader.createString(parcel, header6);
                            break;
                        case 2:
                            j4 = SafeParcelReader.readLong(parcel, header6);
                            break;
                        case 3:
                            s = SafeParcelReader.readShort(parcel, header6);
                            break;
                        case 4:
                            d2 = SafeParcelReader.readDouble(parcel, header6);
                            break;
                        case 5:
                            d3 = SafeParcelReader.readDouble(parcel, header6);
                            break;
                        case 6:
                            f = SafeParcelReader.readFloat(parcel, header6);
                            break;
                        case 7:
                            i9 = SafeParcelReader.readInt(parcel, header6);
                            break;
                        case 8:
                            i10 = SafeParcelReader.readInt(parcel, header6);
                            break;
                        case 9:
                            i8 = SafeParcelReader.readInt(parcel, header6);
                            break;
                        default:
                            SafeParcelReader.skipUnknownField(parcel, header6);
                            break;
                    }
                }
                SafeParcelReader.ensureAtEnd(parcel, iValidateObjectHeader6);
                return new PE1(strCreateString13, i9, s, d2, d3, f, j4, i10, i8);
            case 6:
                int iValidateObjectHeader7 = SafeParcelReader.validateObjectHeader(parcel);
                C7758wF1 c7758wF1 = GF1.b;
                JF1 jf1CreateTypedList = JF1.e;
                int i11 = 0;
                int i12 = 0;
                int i13 = 0;
                String strCreateString14 = null;
                String strCreateString15 = null;
                String strCreateString16 = null;
                C7374uE1 c7374uE1 = null;
                while (parcel.dataPosition() < iValidateObjectHeader7) {
                    int header7 = SafeParcelReader.readHeader(parcel);
                    switch (SafeParcelReader.getFieldId(header7)) {
                        case 1:
                            i11 = SafeParcelReader.readInt(parcel, header7);
                            break;
                        case 2:
                            i12 = SafeParcelReader.readInt(parcel, header7);
                            break;
                        case 3:
                            strCreateString14 = SafeParcelReader.createString(parcel, header7);
                            break;
                        case 4:
                            strCreateString15 = SafeParcelReader.createString(parcel, header7);
                            break;
                        case 5:
                            i13 = SafeParcelReader.readInt(parcel, header7);
                            break;
                        case 6:
                            strCreateString16 = SafeParcelReader.createString(parcel, header7);
                            break;
                        case 7:
                            c7374uE1 = (C7374uE1) SafeParcelReader.createParcelable(parcel, header7, C7374uE1.CREATOR);
                            break;
                        case 8:
                            jf1CreateTypedList = SafeParcelReader.createTypedList(parcel, header7, Feature.CREATOR);
                            break;
                        default:
                            SafeParcelReader.skipUnknownField(parcel, header7);
                            break;
                    }
                }
                SafeParcelReader.ensureAtEnd(parcel, iValidateObjectHeader7);
                return new C7374uE1(i11, i12, strCreateString14, strCreateString15, strCreateString16, i13, jf1CreateTypedList, c7374uE1);
            case 7:
                int iValidateObjectHeader8 = SafeParcelReader.validateObjectHeader(parcel);
                long j5 = 0;
                long j6 = 0;
                boolean z5 = false;
                String strCreateString17 = null;
                String strCreateString18 = null;
                String strCreateString19 = null;
                Bundle bundleCreateBundle = null;
                String strCreateString20 = null;
                while (parcel.dataPosition() < iValidateObjectHeader8) {
                    int header8 = SafeParcelReader.readHeader(parcel);
                    switch (SafeParcelReader.getFieldId(header8)) {
                        case 1:
                            j5 = SafeParcelReader.readLong(parcel, header8);
                            break;
                        case 2:
                            j6 = SafeParcelReader.readLong(parcel, header8);
                            break;
                        case 3:
                            z5 = SafeParcelReader.readBoolean(parcel, header8);
                            break;
                        case 4:
                            strCreateString17 = SafeParcelReader.createString(parcel, header8);
                            break;
                        case 5:
                            strCreateString18 = SafeParcelReader.createString(parcel, header8);
                            break;
                        case 6:
                            strCreateString19 = SafeParcelReader.createString(parcel, header8);
                            break;
                        case 7:
                            bundleCreateBundle = SafeParcelReader.createBundle(parcel, header8);
                            break;
                        case 8:
                            strCreateString20 = SafeParcelReader.createString(parcel, header8);
                            break;
                        default:
                            SafeParcelReader.skipUnknownField(parcel, header8);
                            break;
                    }
                }
                SafeParcelReader.ensureAtEnd(parcel, iValidateObjectHeader8);
                return new C3359dG1(j5, j6, z5, strCreateString17, strCreateString18, strCreateString19, bundleCreateBundle, strCreateString20);
            case 8:
                int iValidateObjectHeader9 = SafeParcelReader.validateObjectHeader(parcel);
                Intent intent = null;
                while (parcel.dataPosition() < iValidateObjectHeader9) {
                    int header9 = SafeParcelReader.readHeader(parcel);
                    int fieldId4 = SafeParcelReader.getFieldId(header9);
                    if (fieldId4 == 1) {
                        i = SafeParcelReader.readInt(parcel, header9);
                    } else if (fieldId4 == 2) {
                        strCreateString7 = SafeParcelReader.createString(parcel, header9);
                    } else if (fieldId4 != 3) {
                        SafeParcelReader.skipUnknownField(parcel, header9);
                    } else {
                        intent = (Intent) SafeParcelReader.createParcelable(parcel, header9, Intent.CREATOR);
                    }
                }
                SafeParcelReader.ensureAtEnd(parcel, iValidateObjectHeader9);
                return new C7380uG1(i, strCreateString7, intent);
            case 9:
                int iValidateObjectHeader10 = SafeParcelReader.validateObjectHeader(parcel);
                while (parcel.dataPosition() < iValidateObjectHeader10) {
                    int header10 = SafeParcelReader.readHeader(parcel);
                    if (SafeParcelReader.getFieldId(header10) != 1) {
                        SafeParcelReader.skipUnknownField(parcel, header10);
                    } else {
                        status = (Status) SafeParcelReader.createParcelable(parcel, header10, Status.CREATOR);
                    }
                }
                SafeParcelReader.ensureAtEnd(parcel, iValidateObjectHeader10);
                return new RJ1(status);
            case 10:
                int iValidateObjectHeader11 = SafeParcelReader.validateObjectHeader(parcel);
                while (parcel.dataPosition() < iValidateObjectHeader11) {
                    int header11 = SafeParcelReader.readHeader(parcel);
                    int fieldId5 = SafeParcelReader.getFieldId(header11);
                    if (fieldId5 == 2) {
                        i = SafeParcelReader.readInt(parcel, header11);
                    } else if (fieldId5 != 3) {
                        SafeParcelReader.skipUnknownField(parcel, header11);
                    } else {
                        strArrCreateStringArray2 = SafeParcelReader.createStringArray(parcel, header11);
                    }
                }
                SafeParcelReader.ensureAtEnd(parcel, iValidateObjectHeader11);
                PO1 po1 = new PO1();
                po1.a = i;
                po1.b = strArrCreateStringArray2;
                return po1;
            case 11:
                int iValidateObjectHeader12 = SafeParcelReader.validateObjectHeader(parcel);
                while (parcel.dataPosition() < iValidateObjectHeader12) {
                    int header12 = SafeParcelReader.readHeader(parcel);
                    int fieldId6 = SafeParcelReader.getFieldId(header12);
                    if (fieldId6 == 1) {
                        strCreateString6 = SafeParcelReader.createString(parcel, header12);
                    } else if (fieldId6 == 2) {
                        j = SafeParcelReader.readLong(parcel, header12);
                    } else if (fieldId6 != 3) {
                        SafeParcelReader.skipUnknownField(parcel, header12);
                    } else {
                        i = SafeParcelReader.readInt(parcel, header12);
                    }
                }
                SafeParcelReader.ensureAtEnd(parcel, iValidateObjectHeader12);
                return new C8382zX1(i, strCreateString6, j);
            case 12:
                int iValidateObjectHeader13 = SafeParcelReader.validateObjectHeader(parcel);
                long j7 = 0;
                long j8 = 0;
                int i14 = 0;
                byte[] bArrCreateByteArray = null;
                String strCreateString21 = null;
                Bundle bundleCreateBundle2 = null;
                String strCreateString22 = null;
                while (parcel.dataPosition() < iValidateObjectHeader13) {
                    int header13 = SafeParcelReader.readHeader(parcel);
                    switch (SafeParcelReader.getFieldId(header13)) {
                        case 1:
                            j7 = SafeParcelReader.readLong(parcel, header13);
                            break;
                        case 2:
                            bArrCreateByteArray = SafeParcelReader.createByteArray(parcel, header13);
                            break;
                        case 3:
                            strCreateString21 = SafeParcelReader.createString(parcel, header13);
                            break;
                        case 4:
                            bundleCreateBundle2 = SafeParcelReader.createBundle(parcel, header13);
                            break;
                        case 5:
                            i14 = SafeParcelReader.readInt(parcel, header13);
                            break;
                        case 6:
                            j8 = SafeParcelReader.readLong(parcel, header13);
                            break;
                        case 7:
                            strCreateString22 = SafeParcelReader.createString(parcel, header13);
                            break;
                        default:
                            SafeParcelReader.skipUnknownField(parcel, header13);
                            break;
                    }
                }
                SafeParcelReader.ensureAtEnd(parcel, iValidateObjectHeader13);
                return new QX1(j7, bArrCreateByteArray, strCreateString21, bundleCreateBundle2, i14, j8, strCreateString22);
            case 13:
                int iValidateObjectHeader14 = SafeParcelReader.validateObjectHeader(parcel);
                while (parcel.dataPosition() < iValidateObjectHeader14) {
                    int header14 = SafeParcelReader.readHeader(parcel);
                    if (SafeParcelReader.getFieldId(header14) != 1) {
                        SafeParcelReader.skipUnknownField(parcel, header14);
                    } else {
                        arrayListCreateIntegerList = SafeParcelReader.createIntegerList(parcel, header14);
                    }
                }
                SafeParcelReader.ensureAtEnd(parcel, iValidateObjectHeader14);
                return new VX1(arrayListCreateIntegerList);
            case 14:
                int iValidateObjectHeader15 = SafeParcelReader.validateObjectHeader(parcel);
                while (parcel.dataPosition() < iValidateObjectHeader15) {
                    int header15 = SafeParcelReader.readHeader(parcel);
                    if (SafeParcelReader.getFieldId(header15) != 1) {
                        SafeParcelReader.skipUnknownField(parcel, header15);
                    } else {
                        arrayListCreateTypedList = SafeParcelReader.createTypedList(parcel, header15, QX1.CREATOR);
                    }
                }
                SafeParcelReader.ensureAtEnd(parcel, iValidateObjectHeader15);
                return new C2156aY1(arrayListCreateTypedList);
            case 15:
                int iValidateObjectHeader16 = SafeParcelReader.validateObjectHeader(parcel);
                long j9 = 0;
                int i15 = 0;
                String strCreateString23 = null;
                Long longObject = null;
                Float floatObject = null;
                String strCreateString24 = null;
                String strCreateString25 = null;
                Double doubleObject = null;
                while (parcel.dataPosition() < iValidateObjectHeader16) {
                    int header16 = SafeParcelReader.readHeader(parcel);
                    switch (SafeParcelReader.getFieldId(header16)) {
                        case 1:
                            i15 = SafeParcelReader.readInt(parcel, header16);
                            break;
                        case 2:
                            strCreateString23 = SafeParcelReader.createString(parcel, header16);
                            break;
                        case 3:
                            j9 = SafeParcelReader.readLong(parcel, header16);
                            break;
                        case 4:
                            longObject = SafeParcelReader.readLongObject(parcel, header16);
                            break;
                        case 5:
                            floatObject = SafeParcelReader.readFloatObject(parcel, header16);
                            break;
                        case 6:
                            strCreateString24 = SafeParcelReader.createString(parcel, header16);
                            break;
                        case 7:
                            strCreateString25 = SafeParcelReader.createString(parcel, header16);
                            break;
                        case 8:
                            doubleObject = SafeParcelReader.readDoubleObject(parcel, header16);
                            break;
                        default:
                            SafeParcelReader.skipUnknownField(parcel, header16);
                            break;
                    }
                }
                SafeParcelReader.ensureAtEnd(parcel, iValidateObjectHeader16);
                return new C5337jZ1(i15, strCreateString23, j9, longObject, floatObject, strCreateString24, strCreateString25, doubleObject);
            case 16:
                int iValidateObjectHeader17 = SafeParcelReader.validateObjectHeader(parcel);
                long j10 = -2147483648L;
                String strCreateString26 = "";
                String strCreateString27 = strCreateString26;
                String strCreateString28 = strCreateString27;
                String strCreateString29 = strCreateString28;
                int i16 = 100;
                long j11 = 0;
                long j12 = 0;
                long j13 = 0;
                long j14 = 0;
                long j15 = 0;
                long j16 = 0;
                long j17 = 0;
                boolean z6 = true;
                boolean z7 = true;
                boolean z8 = false;
                int i17 = 0;
                boolean z9 = false;
                boolean z10 = false;
                int i18 = 0;
                int i19 = 0;
                String strCreateString30 = null;
                String strCreateString31 = null;
                String strCreateString32 = null;
                String strCreateString33 = null;
                String strCreateString34 = null;
                String strCreateString35 = null;
                String strCreateString36 = null;
                Boolean booleanObject = null;
                ArrayList<String> arrayListCreateStringList = null;
                String strCreateString37 = null;
                String strCreateString38 = null;
                String strCreateString39 = null;
                while (parcel.dataPosition() < iValidateObjectHeader17) {
                    int header17 = SafeParcelReader.readHeader(parcel);
                    switch (SafeParcelReader.getFieldId(header17)) {
                        case 2:
                            strCreateString30 = SafeParcelReader.createString(parcel, header17);
                            break;
                        case 3:
                            strCreateString31 = SafeParcelReader.createString(parcel, header17);
                            break;
                        case 4:
                            strCreateString32 = SafeParcelReader.createString(parcel, header17);
                            break;
                        case 5:
                            strCreateString33 = SafeParcelReader.createString(parcel, header17);
                            break;
                        case 6:
                            j11 = SafeParcelReader.readLong(parcel, header17);
                            break;
                        case 7:
                            j12 = SafeParcelReader.readLong(parcel, header17);
                            break;
                        case 8:
                            strCreateString34 = SafeParcelReader.createString(parcel, header17);
                            break;
                        case 9:
                            z6 = SafeParcelReader.readBoolean(parcel, header17);
                            break;
                        case 10:
                            z8 = SafeParcelReader.readBoolean(parcel, header17);
                            break;
                        case 11:
                            j10 = SafeParcelReader.readLong(parcel, header17);
                            break;
                        case 12:
                            strCreateString35 = SafeParcelReader.createString(parcel, header17);
                            break;
                        case 13:
                        case 17:
                        case 20:
                        case 33:
                        default:
                            SafeParcelReader.skipUnknownField(parcel, header17);
                            break;
                        case 14:
                            j13 = SafeParcelReader.readLong(parcel, header17);
                            break;
                        case 15:
                            i17 = SafeParcelReader.readInt(parcel, header17);
                            break;
                        case 16:
                            z7 = SafeParcelReader.readBoolean(parcel, header17);
                            break;
                        case 18:
                            z9 = SafeParcelReader.readBoolean(parcel, header17);
                            break;
                        case 19:
                            strCreateString36 = SafeParcelReader.createString(parcel, header17);
                            break;
                        case 21:
                            booleanObject = SafeParcelReader.readBooleanObject(parcel, header17);
                            break;
                        case 22:
                            j14 = SafeParcelReader.readLong(parcel, header17);
                            break;
                        case 23:
                            arrayListCreateStringList = SafeParcelReader.createStringList(parcel, header17);
                            break;
                        case 24:
                            strCreateString37 = SafeParcelReader.createString(parcel, header17);
                            break;
                        case 25:
                            strCreateString26 = SafeParcelReader.createString(parcel, header17);
                            break;
                        case 26:
                            strCreateString27 = SafeParcelReader.createString(parcel, header17);
                            break;
                        case 27:
                            strCreateString38 = SafeParcelReader.createString(parcel, header17);
                            break;
                        case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                            z10 = SafeParcelReader.readBoolean(parcel, header17);
                            break;
                        case 29:
                            j15 = SafeParcelReader.readLong(parcel, header17);
                            break;
                        case 30:
                            i16 = SafeParcelReader.readInt(parcel, header17);
                            break;
                        case 31:
                            strCreateString28 = SafeParcelReader.createString(parcel, header17);
                            break;
                        case 32:
                            i18 = SafeParcelReader.readInt(parcel, header17);
                            break;
                        case 34:
                            j16 = SafeParcelReader.readLong(parcel, header17);
                            break;
                        case C4473c9.J /* 35 */:
                            strCreateString39 = SafeParcelReader.createString(parcel, header17);
                            break;
                        case FlexBuffers.FBT_VECTOR_BOOL /* 36 */:
                            strCreateString29 = SafeParcelReader.createString(parcel, header17);
                            break;
                        case 37:
                            j17 = SafeParcelReader.readLong(parcel, header17);
                            break;
                        case C4473c9.K /* 38 */:
                            i19 = SafeParcelReader.readInt(parcel, header17);
                            break;
                    }
                }
                SafeParcelReader.ensureAtEnd(parcel, iValidateObjectHeader17);
                return new EY1(strCreateString30, strCreateString31, strCreateString32, strCreateString33, j11, j12, strCreateString34, z6, z8, j10, strCreateString35, j13, i17, z7, z9, strCreateString36, booleanObject, j14, arrayListCreateStringList, strCreateString37, strCreateString26, strCreateString27, strCreateString38, z10, j15, i16, strCreateString28, i18, j16, strCreateString39, strCreateString29, j17, i19);
            case 17:
                int iValidateObjectHeader18 = SafeParcelReader.validateObjectHeader(parcel);
                int i20 = 0;
                boolean z11 = false;
                String strCreateString40 = null;
                Point[] pointArr = null;
                C3407dW1 c3407dW1 = null;
                LZ1 lz1 = null;
                byte[] bArrCreateByteArray2 = null;
                C5229j02 c5229j02 = null;
                C7142t12 c7142t122 = null;
                C3791fX1 c3791fX1 = null;
                K02 k02 = null;
                VR1 vr1 = null;
                C7037sT1 c7037sT1 = null;
                NU1 nu1 = null;
                while (parcel.dataPosition() < iValidateObjectHeader18) {
                    int header18 = SafeParcelReader.readHeader(parcel);
                    switch (SafeParcelReader.getFieldId(header18)) {
                        case 2:
                            i = SafeParcelReader.readInt(parcel, header18);
                            continue;
                        case 3:
                            strCreateString5 = SafeParcelReader.createString(parcel, header18);
                            continue;
                        case 4:
                            strCreateString40 = SafeParcelReader.createString(parcel, header18);
                            continue;
                        case 5:
                            i20 = SafeParcelReader.readInt(parcel, header18);
                            continue;
                        case 6:
                            pointArr = (Point[]) SafeParcelReader.createTypedArray(parcel, header18, Point.CREATOR);
                            continue;
                        case 7:
                            c3407dW1 = (C3407dW1) SafeParcelReader.createParcelable(parcel, header18, C3407dW1.CREATOR);
                            continue;
                        case 8:
                            lz1 = (LZ1) SafeParcelReader.createParcelable(parcel, header18, LZ1.CREATOR);
                            continue;
                        case 9:
                            c5229j02 = (C5229j02) SafeParcelReader.createParcelable(parcel, header18, C5229j02.CREATOR);
                            continue;
                        case 10:
                            c7142t122 = (C7142t12) SafeParcelReader.createParcelable(parcel, header18, C7142t12.CREATOR);
                            continue;
                        case 11:
                            c7142t12 = c7142t122;
                            k02 = (K02) SafeParcelReader.createParcelable(parcel, header18, K02.CREATOR);
                            break;
                        case 12:
                            c7142t12 = c7142t122;
                            c3791fX1 = (C3791fX1) SafeParcelReader.createParcelable(parcel, header18, C3791fX1.CREATOR);
                            break;
                        case 13:
                            c7142t12 = c7142t122;
                            vr1 = (VR1) SafeParcelReader.createParcelable(parcel, header18, VR1.CREATOR);
                            break;
                        case 14:
                            c7142t12 = c7142t122;
                            c7037sT1 = (C7037sT1) SafeParcelReader.createParcelable(parcel, header18, C7037sT1.CREATOR);
                            break;
                        case 15:
                            c7142t12 = c7142t122;
                            nu1 = (NU1) SafeParcelReader.createParcelable(parcel, header18, NU1.CREATOR);
                            break;
                        case 16:
                            bArrCreateByteArray2 = SafeParcelReader.createByteArray(parcel, header18);
                            continue;
                        case 17:
                            z11 = SafeParcelReader.readBoolean(parcel, header18);
                            continue;
                        case 18:
                            d = SafeParcelReader.readDouble(parcel, header18);
                            continue;
                        default:
                            SafeParcelReader.skipUnknownField(parcel, header18);
                            continue;
                    }
                    c7142t122 = c7142t12;
                }
                SafeParcelReader.ensureAtEnd(parcel, iValidateObjectHeader18);
                Y12 y12 = new Y12();
                y12.a = i;
                y12.b = strCreateString5;
                y12.o = bArrCreateByteArray2;
                y12.c = strCreateString40;
                y12.d = i20;
                y12.e = pointArr;
                y12.p = z11;
                y12.q = d;
                y12.f = c3407dW1;
                y12.g = lz1;
                y12.h = c5229j02;
                y12.i = c7142t122;
                y12.j = k02;
                y12.k = c3791fX1;
                y12.l = vr1;
                y12.m = c7037sT1;
                y12.n = nu1;
                return y12;
            case 18:
                int iValidateObjectHeader19 = SafeParcelReader.validateObjectHeader(parcel);
                int i21 = 0;
                int i22 = 0;
                int i23 = 0;
                int i24 = 0;
                int i25 = 0;
                boolean z12 = false;
                while (parcel.dataPosition() < iValidateObjectHeader19) {
                    int header19 = SafeParcelReader.readHeader(parcel);
                    switch (SafeParcelReader.getFieldId(header19)) {
                        case 2:
                            i = SafeParcelReader.readInt(parcel, header19);
                            break;
                        case 3:
                            i21 = SafeParcelReader.readInt(parcel, header19);
                            break;
                        case 4:
                            i22 = SafeParcelReader.readInt(parcel, header19);
                            break;
                        case 5:
                            i23 = SafeParcelReader.readInt(parcel, header19);
                            break;
                        case 6:
                            i24 = SafeParcelReader.readInt(parcel, header19);
                            break;
                        case 7:
                            i25 = SafeParcelReader.readInt(parcel, header19);
                            break;
                        case 8:
                            z12 = SafeParcelReader.readBoolean(parcel, header19);
                            break;
                        case 9:
                            strCreateString4 = SafeParcelReader.createString(parcel, header19);
                            break;
                        default:
                            SafeParcelReader.skipUnknownField(parcel, header19);
                            break;
                    }
                }
                SafeParcelReader.ensureAtEnd(parcel, iValidateObjectHeader19);
                C5883mQ1 c5883mQ1 = new C5883mQ1();
                c5883mQ1.a = i;
                c5883mQ1.b = i21;
                c5883mQ1.c = i22;
                c5883mQ1.d = i23;
                c5883mQ1.e = i24;
                c5883mQ1.f = i25;
                c5883mQ1.g = z12;
                c5883mQ1.h = strCreateString4;
                return c5883mQ1;
            case 19:
                int iValidateObjectHeader20 = SafeParcelReader.validateObjectHeader(parcel);
                String strCreateString41 = null;
                String strCreateString42 = null;
                String strCreateString43 = null;
                String strCreateString44 = null;
                C5883mQ1 c5883mQ12 = null;
                C5883mQ1 c5883mQ13 = null;
                while (parcel.dataPosition() < iValidateObjectHeader20) {
                    int header20 = SafeParcelReader.readHeader(parcel);
                    switch (SafeParcelReader.getFieldId(header20)) {
                        case 2:
                            strCreateString3 = SafeParcelReader.createString(parcel, header20);
                            break;
                        case 3:
                            strCreateString41 = SafeParcelReader.createString(parcel, header20);
                            break;
                        case 4:
                            strCreateString42 = SafeParcelReader.createString(parcel, header20);
                            break;
                        case 5:
                            strCreateString43 = SafeParcelReader.createString(parcel, header20);
                            break;
                        case 6:
                            strCreateString44 = SafeParcelReader.createString(parcel, header20);
                            break;
                        case 7:
                            c5883mQ12 = (C5883mQ1) SafeParcelReader.createParcelable(parcel, header20, C5883mQ1.CREATOR);
                            break;
                        case 8:
                            c5883mQ13 = (C5883mQ1) SafeParcelReader.createParcelable(parcel, header20, C5883mQ1.CREATOR);
                            break;
                        default:
                            SafeParcelReader.skipUnknownField(parcel, header20);
                            break;
                    }
                }
                SafeParcelReader.ensureAtEnd(parcel, iValidateObjectHeader20);
                VR1 vr12 = new VR1();
                vr12.a = strCreateString3;
                vr12.b = strCreateString41;
                vr12.c = strCreateString42;
                vr12.d = strCreateString43;
                vr12.e = strCreateString44;
                vr12.f = c5883mQ12;
                vr12.g = c5883mQ13;
                return vr12;
            case 20:
                int iValidateObjectHeader21 = SafeParcelReader.validateObjectHeader(parcel);
                while (parcel.dataPosition() < iValidateObjectHeader21) {
                    int header21 = SafeParcelReader.readHeader(parcel);
                    int fieldId7 = SafeParcelReader.getFieldId(header21);
                    if (fieldId7 == 1) {
                        i = SafeParcelReader.readInt(parcel, header21);
                    } else if (fieldId7 != 2) {
                        SafeParcelReader.skipUnknownField(parcel, header21);
                    } else {
                        strArrCreateStringArray = SafeParcelReader.createStringArray(parcel, header21);
                    }
                }
                SafeParcelReader.ensureAtEnd(parcel, iValidateObjectHeader21);
                return new w32(i, strArrCreateStringArray);
            case 21:
                int iValidateObjectHeader22 = SafeParcelReader.validateObjectHeader(parcel);
                String strCreateString45 = null;
                String strCreateString46 = null;
                LZ1[] lz1Arr = null;
                C3407dW1[] c3407dW1Arr = null;
                String[] strArrCreateStringArray3 = null;
                PO1[] po1Arr = null;
                while (parcel.dataPosition() < iValidateObjectHeader22) {
                    int header22 = SafeParcelReader.readHeader(parcel);
                    switch (SafeParcelReader.getFieldId(header22)) {
                        case 2:
                            ay1 = (AY1) SafeParcelReader.createParcelable(parcel, header22, AY1.CREATOR);
                            break;
                        case 3:
                            strCreateString45 = SafeParcelReader.createString(parcel, header22);
                            break;
                        case 4:
                            strCreateString46 = SafeParcelReader.createString(parcel, header22);
                            break;
                        case 5:
                            lz1Arr = (LZ1[]) SafeParcelReader.createTypedArray(parcel, header22, LZ1.CREATOR);
                            break;
                        case 6:
                            c3407dW1Arr = (C3407dW1[]) SafeParcelReader.createTypedArray(parcel, header22, C3407dW1.CREATOR);
                            break;
                        case 7:
                            strArrCreateStringArray3 = SafeParcelReader.createStringArray(parcel, header22);
                            break;
                        case 8:
                            po1Arr = (PO1[]) SafeParcelReader.createTypedArray(parcel, header22, PO1.CREATOR);
                            break;
                        default:
                            SafeParcelReader.skipUnknownField(parcel, header22);
                            break;
                    }
                }
                SafeParcelReader.ensureAtEnd(parcel, iValidateObjectHeader22);
                C7037sT1 c7037sT12 = new C7037sT1();
                c7037sT12.a = ay1;
                c7037sT12.b = strCreateString45;
                c7037sT12.c = strCreateString46;
                c7037sT12.d = lz1Arr;
                c7037sT12.e = c3407dW1Arr;
                c7037sT12.f = strArrCreateStringArray3;
                c7037sT12.g = po1Arr;
                return c7037sT12;
            case 22:
                int iValidateObjectHeader23 = SafeParcelReader.validateObjectHeader(parcel);
                int i26 = 0;
                int i27 = 0;
                String strCreateString47 = null;
                String strCreateString48 = null;
                byte[] bArrCreateByteArray3 = null;
                Point[] pointArr2 = null;
                B32 b32 = null;
                E32 e32 = null;
                F32 f32 = null;
                I32 i32 = null;
                G32 g32 = null;
                C32 c32 = null;
                y32 y32Var = null;
                z32 z32Var = null;
                A32 a32 = null;
                while (parcel.dataPosition() < iValidateObjectHeader23) {
                    int header23 = SafeParcelReader.readHeader(parcel);
                    switch (SafeParcelReader.getFieldId(header23)) {
                        case 1:
                            i26 = SafeParcelReader.readInt(parcel, header23);
                            break;
                        case 2:
                            strCreateString47 = SafeParcelReader.createString(parcel, header23);
                            break;
                        case 3:
                            strCreateString48 = SafeParcelReader.createString(parcel, header23);
                            break;
                        case 4:
                            bArrCreateByteArray3 = SafeParcelReader.createByteArray(parcel, header23);
                            break;
                        case 5:
                            pointArr2 = (Point[]) SafeParcelReader.createTypedArray(parcel, header23, Point.CREATOR);
                            break;
                        case 6:
                            i27 = SafeParcelReader.readInt(parcel, header23);
                            break;
                        case 7:
                            b32 = (B32) SafeParcelReader.createParcelable(parcel, header23, B32.CREATOR);
                            break;
                        case 8:
                            e32 = (E32) SafeParcelReader.createParcelable(parcel, header23, E32.CREATOR);
                            break;
                        case 9:
                            f32 = (F32) SafeParcelReader.createParcelable(parcel, header23, F32.CREATOR);
                            break;
                        case 10:
                            i32 = (I32) SafeParcelReader.createParcelable(parcel, header23, I32.CREATOR);
                            break;
                        case 11:
                            g32 = (G32) SafeParcelReader.createParcelable(parcel, header23, G32.CREATOR);
                            break;
                        case 12:
                            c32 = (C32) SafeParcelReader.createParcelable(parcel, header23, C32.CREATOR);
                            break;
                        case 13:
                            y32Var = (y32) SafeParcelReader.createParcelable(parcel, header23, y32.CREATOR);
                            break;
                        case 14:
                            z32Var = (z32) SafeParcelReader.createParcelable(parcel, header23, z32.CREATOR);
                            break;
                        case 15:
                            a32 = (A32) SafeParcelReader.createParcelable(parcel, header23, A32.CREATOR);
                            break;
                        default:
                            SafeParcelReader.skipUnknownField(parcel, header23);
                            break;
                    }
                }
                SafeParcelReader.ensureAtEnd(parcel, iValidateObjectHeader23);
                return new J32(i26, strCreateString47, strCreateString48, bArrCreateByteArray3, pointArr2, i27, b32, e32, f32, i32, g32, c32, y32Var, z32Var, a32);
            case 23:
                int iValidateObjectHeader24 = SafeParcelReader.validateObjectHeader(parcel);
                boolean z13 = false;
                while (parcel.dataPosition() < iValidateObjectHeader24) {
                    int header24 = SafeParcelReader.readHeader(parcel);
                    int fieldId8 = SafeParcelReader.getFieldId(header24);
                    if (fieldId8 == 1) {
                        i = SafeParcelReader.readInt(parcel, header24);
                    } else if (fieldId8 != 2) {
                        SafeParcelReader.skipUnknownField(parcel, header24);
                    } else {
                        z13 = SafeParcelReader.readBoolean(parcel, header24);
                    }
                }
                SafeParcelReader.ensureAtEnd(parcel, iValidateObjectHeader24);
                return new K32(i, z13);
            case 24:
                int iValidateObjectHeader25 = SafeParcelReader.validateObjectHeader(parcel);
                int i28 = 0;
                int i29 = 0;
                int i30 = 0;
                int i31 = 0;
                int i33 = 0;
                int i34 = 0;
                boolean z14 = false;
                String strCreateString49 = null;
                while (parcel.dataPosition() < iValidateObjectHeader25) {
                    int header25 = SafeParcelReader.readHeader(parcel);
                    switch (SafeParcelReader.getFieldId(header25)) {
                        case 1:
                            i28 = SafeParcelReader.readInt(parcel, header25);
                            break;
                        case 2:
                            i29 = SafeParcelReader.readInt(parcel, header25);
                            break;
                        case 3:
                            i30 = SafeParcelReader.readInt(parcel, header25);
                            break;
                        case 4:
                            i31 = SafeParcelReader.readInt(parcel, header25);
                            break;
                        case 5:
                            i33 = SafeParcelReader.readInt(parcel, header25);
                            break;
                        case 6:
                            i34 = SafeParcelReader.readInt(parcel, header25);
                            break;
                        case 7:
                            z14 = SafeParcelReader.readBoolean(parcel, header25);
                            break;
                        case 8:
                            strCreateString49 = SafeParcelReader.createString(parcel, header25);
                            break;
                        default:
                            SafeParcelReader.skipUnknownField(parcel, header25);
                            break;
                    }
                }
                SafeParcelReader.ensureAtEnd(parcel, iValidateObjectHeader25);
                return new x32(i28, i29, i30, i31, i33, i34, z14, strCreateString49);
            case 25:
                int iValidateObjectHeader26 = SafeParcelReader.validateObjectHeader(parcel);
                String strCreateString50 = null;
                String strCreateString51 = null;
                String strCreateString52 = null;
                String strCreateString53 = null;
                String strCreateString54 = null;
                x32 x32Var = null;
                x32 x32Var2 = null;
                while (parcel.dataPosition() < iValidateObjectHeader26) {
                    int header26 = SafeParcelReader.readHeader(parcel);
                    switch (SafeParcelReader.getFieldId(header26)) {
                        case 1:
                            strCreateString50 = SafeParcelReader.createString(parcel, header26);
                            break;
                        case 2:
                            strCreateString51 = SafeParcelReader.createString(parcel, header26);
                            break;
                        case 3:
                            strCreateString52 = SafeParcelReader.createString(parcel, header26);
                            break;
                        case 4:
                            strCreateString53 = SafeParcelReader.createString(parcel, header26);
                            break;
                        case 5:
                            strCreateString54 = SafeParcelReader.createString(parcel, header26);
                            break;
                        case 6:
                            x32Var = (x32) SafeParcelReader.createParcelable(parcel, header26, x32.CREATOR);
                            break;
                        case 7:
                            x32Var2 = (x32) SafeParcelReader.createParcelable(parcel, header26, x32.CREATOR);
                            break;
                        default:
                            SafeParcelReader.skipUnknownField(parcel, header26);
                            break;
                    }
                }
                SafeParcelReader.ensureAtEnd(parcel, iValidateObjectHeader26);
                return new y32(strCreateString50, strCreateString51, strCreateString52, strCreateString53, strCreateString54, x32Var, x32Var2);
            case 26:
                int iValidateObjectHeader27 = SafeParcelReader.validateObjectHeader(parcel);
                D32 d32 = null;
                String strCreateString55 = null;
                String strCreateString56 = null;
                E32[] e32Arr = null;
                B32[] b32Arr = null;
                String[] strArrCreateStringArray4 = null;
                w32[] w32VarArr = null;
                while (parcel.dataPosition() < iValidateObjectHeader27) {
                    int header27 = SafeParcelReader.readHeader(parcel);
                    switch (SafeParcelReader.getFieldId(header27)) {
                        case 1:
                            d32 = (D32) SafeParcelReader.createParcelable(parcel, header27, D32.CREATOR);
                            break;
                        case 2:
                            strCreateString55 = SafeParcelReader.createString(parcel, header27);
                            break;
                        case 3:
                            strCreateString56 = SafeParcelReader.createString(parcel, header27);
                            break;
                        case 4:
                            e32Arr = (E32[]) SafeParcelReader.createTypedArray(parcel, header27, E32.CREATOR);
                            break;
                        case 5:
                            b32Arr = (B32[]) SafeParcelReader.createTypedArray(parcel, header27, B32.CREATOR);
                            break;
                        case 6:
                            strArrCreateStringArray4 = SafeParcelReader.createStringArray(parcel, header27);
                            break;
                        case 7:
                            w32VarArr = (w32[]) SafeParcelReader.createTypedArray(parcel, header27, w32.CREATOR);
                            break;
                        default:
                            SafeParcelReader.skipUnknownField(parcel, header27);
                            break;
                    }
                }
                SafeParcelReader.ensureAtEnd(parcel, iValidateObjectHeader27);
                return new z32(d32, strCreateString55, strCreateString56, e32Arr, b32Arr, strArrCreateStringArray4, w32VarArr);
            case 27:
                int iValidateObjectHeader28 = SafeParcelReader.validateObjectHeader(parcel);
                String strCreateString57 = null;
                String strCreateString58 = null;
                String strCreateString59 = null;
                String strCreateString60 = null;
                String strCreateString61 = null;
                String strCreateString62 = null;
                String strCreateString63 = null;
                String strCreateString64 = null;
                String strCreateString65 = null;
                String strCreateString66 = null;
                String strCreateString67 = null;
                String strCreateString68 = null;
                String strCreateString69 = null;
                String strCreateString70 = null;
                while (parcel.dataPosition() < iValidateObjectHeader28) {
                    int header28 = SafeParcelReader.readHeader(parcel);
                    switch (SafeParcelReader.getFieldId(header28)) {
                        case 1:
                            strCreateString57 = SafeParcelReader.createString(parcel, header28);
                            break;
                        case 2:
                            strCreateString58 = SafeParcelReader.createString(parcel, header28);
                            break;
                        case 3:
                            strCreateString59 = SafeParcelReader.createString(parcel, header28);
                            break;
                        case 4:
                            strCreateString60 = SafeParcelReader.createString(parcel, header28);
                            break;
                        case 5:
                            strCreateString61 = SafeParcelReader.createString(parcel, header28);
                            break;
                        case 6:
                            strCreateString62 = SafeParcelReader.createString(parcel, header28);
                            break;
                        case 7:
                            strCreateString63 = SafeParcelReader.createString(parcel, header28);
                            break;
                        case 8:
                            strCreateString64 = SafeParcelReader.createString(parcel, header28);
                            break;
                        case 9:
                            strCreateString65 = SafeParcelReader.createString(parcel, header28);
                            break;
                        case 10:
                            strCreateString66 = SafeParcelReader.createString(parcel, header28);
                            break;
                        case 11:
                            strCreateString67 = SafeParcelReader.createString(parcel, header28);
                            break;
                        case 12:
                            strCreateString68 = SafeParcelReader.createString(parcel, header28);
                            break;
                        case 13:
                            strCreateString69 = SafeParcelReader.createString(parcel, header28);
                            break;
                        case 14:
                            strCreateString70 = SafeParcelReader.createString(parcel, header28);
                            break;
                        default:
                            SafeParcelReader.skipUnknownField(parcel, header28);
                            break;
                    }
                }
                SafeParcelReader.ensureAtEnd(parcel, iValidateObjectHeader28);
                return new A32(strCreateString57, strCreateString58, strCreateString59, strCreateString60, strCreateString61, strCreateString62, strCreateString63, strCreateString64, strCreateString65, strCreateString66, strCreateString67, strCreateString68, strCreateString69, strCreateString70);
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                int iValidateObjectHeader29 = SafeParcelReader.validateObjectHeader(parcel);
                String strCreateString71 = null;
                String strCreateString72 = null;
                while (parcel.dataPosition() < iValidateObjectHeader29) {
                    int header29 = SafeParcelReader.readHeader(parcel);
                    int fieldId9 = SafeParcelReader.getFieldId(header29);
                    if (fieldId9 == 1) {
                        i = SafeParcelReader.readInt(parcel, header29);
                    } else if (fieldId9 == 2) {
                        strCreateString2 = SafeParcelReader.createString(parcel, header29);
                    } else if (fieldId9 == 3) {
                        strCreateString71 = SafeParcelReader.createString(parcel, header29);
                    } else if (fieldId9 != 4) {
                        SafeParcelReader.skipUnknownField(parcel, header29);
                    } else {
                        strCreateString72 = SafeParcelReader.createString(parcel, header29);
                    }
                }
                SafeParcelReader.ensureAtEnd(parcel, iValidateObjectHeader29);
                return new B32(strCreateString2, i, strCreateString71, strCreateString72);
            default:
                int iValidateObjectHeader30 = SafeParcelReader.validateObjectHeader(parcel);
                double d4 = 0.0d;
                while (parcel.dataPosition() < iValidateObjectHeader30) {
                    int header30 = SafeParcelReader.readHeader(parcel);
                    int fieldId10 = SafeParcelReader.getFieldId(header30);
                    if (fieldId10 == 1) {
                        d = SafeParcelReader.readDouble(parcel, header30);
                    } else if (fieldId10 != 2) {
                        SafeParcelReader.skipUnknownField(parcel, header30);
                    } else {
                        d4 = SafeParcelReader.readDouble(parcel, header30);
                    }
                }
                SafeParcelReader.ensureAtEnd(parcel, iValidateObjectHeader30);
                return new C32(d, d4);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new WC1[i];
            case 1:
                return new PC1[i];
            case 2:
                return new BE1[i];
            case 3:
                return new FE1[i];
            case 4:
                return new LE1[i];
            case 5:
                return new PE1[i];
            case 6:
                return new C7374uE1[i];
            case 7:
                return new C3359dG1[i];
            case 8:
                return new C7380uG1[i];
            case 9:
                return new RJ1[i];
            case 10:
                return new PO1[i];
            case 11:
                return new C8382zX1[i];
            case 12:
                return new QX1[i];
            case 13:
                return new VX1[i];
            case 14:
                return new C2156aY1[i];
            case 15:
                return new C5337jZ1[i];
            case 16:
                return new EY1[i];
            case 17:
                return new Y12[i];
            case 18:
                return new C5883mQ1[i];
            case 19:
                return new VR1[i];
            case 20:
                return new w32[i];
            case 21:
                return new C7037sT1[i];
            case 22:
                return new J32[i];
            case 23:
                return new K32[i];
            case 24:
                return new x32[i];
            case 25:
                return new y32[i];
            case 26:
                return new z32[i];
            case 27:
                return new A32[i];
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                return new B32[i];
            default:
                return new C32[i];
        }
    }
}
