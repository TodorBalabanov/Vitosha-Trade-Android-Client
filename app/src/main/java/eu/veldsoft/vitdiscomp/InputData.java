package eu.veldsoft.vitdiscomp;

/**
 * It is used for system input during initial development before the mobile
 * client to be connected to the remote server for input feed.
 *
 * @author Todor Balabanov
 */
class InputData {
	public static final String SYMBOL = "SIN";
	public static final int PERIOD = 1;
	public static final long TIME[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91, 92, 93, 94, 95, 96, 97, 98, 99, 100};
	public static final double OPEN[] = {27.5732388633, 28.1836768414, 21.2700800725, 13.1887775422, 11.369681528, 17.4852605162, 25.9128793885, 28.9042242196, 23.7090663672, 15.103810002, 11.000088141, 15.170843738, 23.7815033314, 28.9154662013, 25.8525905614, 17.40887015, 11.3474225731, 13.2411147791, 21.348894887, 28.2165072565, 27.5299007468, 19.9203382164, 12.3840163624, 11.8497947419, 18.8088342491, 26.8630260543, 28.6073833556, 22.4381520948, 14.0272950421, 11.1077153832, 16.3636611921, 24.9628401312, 28.999206741, 24.7617441751, 16.1463559745, 11.073990319, 14.2081567998, 22.6673172084, 28.6741584766, 26.7060184443, 18.5723959808, 11.7513060688, 12.5140273163, 20.1593173259, 27.6581317208, 28.1160951288, 21.1121581047, 13.0857080481, 11.4162261252, 17.6386263167, 26.0320625826, 28.8796483284, 23.5633263516, 14.9708985603, 11.0022034398, 15.3060409812, 23.9254827972, 28.9358538328, 25.7306420643, 17.2567044101, 11.3049400699, 13.3473737302, 21.5062013027, 28.2802343438, 27.4414581154, 19.7610396138, 12.3003201892, 11.9186508738, 18.966936676, 26.965016134, 28.5594918793, 22.2844102649, 13.909052388, 11.1336836558, 16.5099652813, 25.0949687321, 28.9956814272, 24.6258061039, 16.0029859816, 11.0550021147, 14.3310080515, 22.8190590419, 28.7152801499, 26.5987128807, 18.4153194205, 11.688873977, 12.6036394703, 20.3185847246, 27.7406246523, 28.0459699724, 20.9538876058, 12.9848053735, 11.4654607286, 17.7927321308, 26.1493554326, 28.8522897089, 23.4164696512, 14.8395631521, 11.0071384923, 15.44270923};
	public static final double LOW[] = {25.8902968937, 26.3650819878, 20.9878400564, 12.4319750469, 10.4107572534, 17.205845018, 24.598906191, 26.9255077264, 22.8848293967, 14.5597888911, 10.0000979345, 14.63427082, 22.9411692578, 26.9342514899, 24.5520148811, 17.1209668333, 10.3860250812, 12.4901275323, 21.0491404676, 26.3906167551, 25.8565894698, 19.9114869071, 11.5377959582, 10.9442163799, 18.676482499, 25.3379091534, 26.6946314988, 21.8963405182, 13.3636611579, 10.1196837591, 15.9596235468, 23.8599867687, 26.9993830208, 23.7035788028, 15.718173305, 10.0822114656, 13.5646186664, 22.074580051, 26.746567704, 25.2157921234, 18.413773312, 10.8347845208, 11.6822525737, 20.1239134757, 25.9563246717, 26.3125184335, 20.8650118592, 12.3174533868, 10.4624734724, 17.376251463, 24.6916042309, 26.9063931443, 22.7714760513, 14.4121095115, 10.0024482664, 14.7844899791, 23.0531532867, 26.9501085366, 24.45716605, 16.951893789, 10.3388222999, 12.6081930335, 21.1714899021, 26.4401822674, 25.7878007564, 19.7344884598, 11.4448002102, 11.0207231931, 18.8521518622, 25.4172347709, 26.6573825728, 21.7767635393, 13.2322804311, 10.1485373953, 16.1221836459, 23.9627534583, 26.9966411101, 23.5978491919, 15.5588733129, 10.0611134608, 13.7011200573, 22.192601477, 26.7785512277, 25.1323322405, 18.2392438005, 10.76541553, 11.7818216337, 20.2477881191, 26.0204858407, 26.2579766452, 20.7419125823, 12.2053393038, 10.5171785873, 17.5474801453, 24.7828320032, 26.885114218, 22.6572541732, 14.2661812801, 10.0079316581, 14.9363435889};
	public static final double HIGH[] = {28.4147098481, 29.0929742683, 21.4112000806, 14.7023825328, 13.2875300774, 18.0440915126, 26.5698659872, 29.8935824662, 24.1211848524, 16.1918522238, 13.0000685541, 16.243989574, 24.2016703683, 29.9060735569, 26.5028784016, 17.9846767833, 13.2702175568, 14.7430892726, 21.4987720966, 29.1294525073, 28.3665563854, 19.938040835, 14.0764571708, 13.660951466, 19.0735377493, 27.6255845048, 29.563759284, 22.7090578831, 15.3545628105, 13.0837786314, 17.1717364827, 25.5142668124, 29.9991186011, 25.2908268612, 17.0027213135, 13.0575480259, 15.4952330665, 22.9636857871, 29.6379538628, 27.4511316048, 18.8896413184, 13.5843491646, 14.1775768016, 20.1770192511, 28.5090352453, 29.0178834765, 21.2357312275, 14.6222173707, 13.3237314307, 18.1633760241, 26.7022917584, 29.8662759204, 23.9592515018, 16.088476658, 13.0017137865, 16.3491429854, 24.3616475525, 29.9287264808, 26.3673800714, 17.8663256523, 13.2371756099, 14.8257351235, 21.673557003, 29.200260382, 28.2682867949, 19.8141419218, 14.0113601472, 13.7145062352, 19.1965063035, 27.7389068156, 29.5105465325, 22.5382336276, 15.2625963018, 13.1039761767, 17.2855285521, 25.661076369, 29.9952015858, 25.1397845599, 16.891211319, 13.0427794225, 15.5907840401, 23.1322878243, 29.683644611, 27.3319032007, 18.7674706604, 13.535790871, 14.2472751436, 20.3539830273, 28.6006940581, 28.939966636, 21.0598751175, 14.5437375127, 13.3620250111, 18.2832361017, 26.8326171474, 29.8358774543, 23.7960773903, 15.9863268961, 13.0055521607, 16.4554405122};
	public static final double CLOSE[] = {26.7317678785, 27.2743794146, 21.1289600645, 13.9455800375, 12.3286058027, 17.7646760144, 25.2558927898, 27.914865973, 23.2969478819, 15.6478311129, 12.0000783476, 15.707416656, 23.3613362946, 27.9248588456, 25.2023027213, 17.6967734667, 12.308820065, 13.9921020258, 21.1990176773, 27.3035620058, 26.6932451083, 19.9291895257, 13.2302367666, 12.7553731039, 18.9411859992, 26.1004676038, 27.6510074272, 22.1672463065, 14.6909289263, 12.0957470073, 16.7676988374, 24.4114134499, 27.9992948809, 24.232661489, 16.574538644, 12.0657691725, 14.8516949331, 22.3709486297, 27.7103630903, 25.9609052838, 18.7310186496, 12.6678276167, 13.345802059, 20.1416154008, 26.8072281963, 27.2143067812, 20.988584982, 13.8539627094, 12.3699787779, 17.9010011704, 25.3618334067, 27.8930207363, 23.1674012015, 15.5296876092, 12.0019586131, 15.8275919833, 23.489318042, 27.9429811847, 25.0939040571, 17.5615150312, 12.2710578399, 14.0865544268, 21.3388456024, 27.3602083056, 26.6146294359, 19.7875907678, 13.1558401682, 12.8165785545, 19.0817214897, 26.1911254525, 27.608437226, 22.0305869021, 14.5858243449, 12.1188299163, 16.8977469167, 24.5288610952, 27.9961612686, 24.1118276479, 16.4470986503, 12.0488907686, 14.9608960458, 22.5058302595, 27.7469156888, 25.8655225606, 18.5913950404, 12.612332424, 13.425457307, 20.2831864219, 26.8805552465, 27.1519733088, 20.847900094, 13.7642714431, 12.4137428698, 18.0379841163, 25.4660937179, 27.8687019635, 23.0368619122, 15.4129450241, 12.0063453265, 15.9490748711};
	public static final double VOLUME[] = {0.0030478284, 0.002650263, 3.69181694435483E-005, 0.0013719316, 0.0096182609, 0.0084393106, 0.0032294519, 2.99235849798671E-005, 0.0046095938, 0.0071312902, 0.0015329196, 0.0046888, 0.0074688258, 0.0090590451, 0.0089595055, 0.0026029426, 0.0099178482, 0.0048826239, 0.0003848177, 0.0080661937, 0.0033323427, 0.0069533163, 0.002904526, 0.0016695002, 0.0052674118, 0.0045786487, 0.0019596496, 0.0057643666, 0.0095277692, 0.0078224915, 0.009334395, 0.0078497075, 0.0045535708, 0.0075803442, 0.0013621444, 0.0053747442, 0.0038106146, 0.0022439479, 0.0088013197, 0.0093057859, 0.0088528892, 0.0013402526, 0.0070956869, 0.0009398061, 0.0045229839, 0.0056944544, 0.0044673622, 0.000550267, 0.0047013007, 0.0041650955, 0.0091943481, 0.0088512464, 0.0095721812, 0.0075226499, 0.0029033327, 0.0035524879, 0.0063634052, 0.0066362653, 0.0020564783, 0.0081657101, 0.0083053492, 0.0056054153, 0.0010019466, 0.0026247979, 4.02909468788331E-005, 0.0045057452, 0.0037352035, 0.0026721243, 0.000589162, 0.0046932194, 2.6391175973192E-005, 0.0015317594, 0.0008323608, 0.0059906857, 0.002755351, 0.0023297748, 0.0067270723, 0.0048973227, 0.0008154278, 0.0036754432, 0.0061343362, 0.0038569436, 0.0048105981, 0.0098453348, 0.0036562993, 0.0037358071, 0.0025286826, 0.0014831459, 0.0033459132, 0.007111612, 0.0097147017, 0.0048567041, 0.0043558928, 0.0078681516, 0.0013301081, 0.0099094235, 0.0008820774, 0.0038876465, 0.0008313177, 0.0063465581};
	public static final int NEURONS[] = {1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 0, 0, 0, 0, 0, 0, 1, 4, 4, 4, 4, 4};
	public static final double ACTIVITIES[][] = { {1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0}, {1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0}, {1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0}, {1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0}, {1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0}, {1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0}, {1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0}, {1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0}, {1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0}, {1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0}, {1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0}, {1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0}, {1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0}, {1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0}, {1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0}, {1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0}, {1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0}, {1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0}, {1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0}, {1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0}, {1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0}, {1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0}, {1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0}, {1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0},};
	public static final double WEIGHTS[][] = { {+0.018, +0.018, -0.063, -0.092, -0.017, +0.063, -0.075, +0.066, -0.048, -0.044, +0.005, -0.097, +0.002, +0.094, -0.068, +0.019, +0.029, -0.051, +0.047, -0.084, +0.075, +0.091, +0.093, +0.070}, {+0.034, -0.062, -0.070, -0.015, -0.032, +0.031, +0.093, -0.093, -0.039, +0.084, +0.053, +0.097, -0.077, +0.100, +0.034, -0.030, +0.003, +0.073, -0.042, -0.080, +0.015, -0.092, +0.034, +0.006}, {-0.096, +0.060, +0.028, +0.073, -0.079, +0.040, +0.038, -0.014, +0.039, +0.065, +0.056, -0.030, +0.033, +0.008, -0.004, +0.040, -0.024, +0.060, +0.043, -0.048, +0.057, +0.027, +0.080, -0.088}, {-0.036, +0.030, +0.057, -0.026, +0.009, +0.043, +0.099, -0.094, +0.008, -0.092, +0.086, -0.079, -0.094, -0.025, +0.032, +0.062, +0.063, -0.026, -0.028, +0.022, -0.027, -0.076, -0.024, +0.060}, {-0.081, +0.088, +0.059, +0.070, +0.056, +0.059, -0.071, +0.078, +0.081, -0.094, +0.028, +0.091, +0.095, -0.020, +0.082, +0.011, +0.027, +0.088, +0.049, -0.055, +0.044, +0.097, -0.041, -0.096}, {-0.097, +0.071, -0.030, -0.004, -0.094, -0.018, -0.045, +0.044, -0.025, -0.069, -0.092, +0.007, -0.058, +0.099, -0.074, +0.096, +0.023, -0.071, +0.022, +0.029, +0.027, +0.065, +0.010, +0.081}, {+0.078, +0.043, +0.074, -0.035, -0.059, +0.019, +0.070, +0.067, -0.074, +0.078, +0.072, +0.030, -0.036, -0.013, +0.022, -0.097, +0.014, -0.009, -0.056, +0.047, -0.062, -0.031, -0.098, -0.055}, {-0.040, +0.057, -0.029, +0.033, +0.042, +0.098, -0.042, -0.042, -0.004, -0.059, +0.023, -0.070, -0.015, +0.093, +0.065, -0.058, +0.056, +0.016, -0.081, +0.014, -0.075, +0.067, -0.053, -0.011}, {+0.080, +0.034, +0.009, +0.047, +0.044, -0.011, -0.037, -0.029, +0.003, +0.028, -0.051, +0.099, +0.020, -0.046, -0.073, +0.013, +0.077, -0.062, +0.015, +0.054, +0.056, -0.093, +0.087, -0.042}, {+0.047, +0.013, -0.023, -0.022, +0.071, +0.004, -0.028, -0.046, +0.036, +0.082, +0.020, -0.070, -0.027, -0.026, -0.068, +0.006, +0.000, +0.098, -0.085, +0.009, -0.039, -0.096, +0.094, +0.009}, {-0.030, -0.090, +0.099, -0.076, +0.079, -0.041, -0.062, -0.017, +0.019, -0.075, +0.002, +0.082, -0.078, -0.017, -0.006, +0.021, -0.086, -0.094, +0.031, +0.003, -0.032, -0.081, +0.047, -0.035}, {+0.098, +0.096, +0.059, -0.046, -0.095, -0.072, -0.049, +0.006, -0.088, +0.092, -0.039, +0.073, -0.032, +0.025, -0.067, +0.065, +0.073, -0.008, -0.050, +0.049, +0.086, +0.054, +0.047, -0.059}, {+0.085, +0.091, -0.039, -0.003, +0.083, -0.094, -0.006, +0.032, -0.054, -0.078, -0.071, +0.040, -0.069, +0.064, +0.002, +0.053, -0.014, +0.059, +0.029, -0.087, +0.018, +0.000, +0.082, +0.099}, {+0.008, +0.083, +0.012, +0.050, +0.096, +0.025, +0.020, +0.070, -0.058, -0.055, +0.056, -0.020, -0.030, +0.086, -0.082, +0.052, +0.000, -0.026, -0.019, -0.052, +0.030, -0.081, -0.025, +0.067}, {+0.005, +0.084, -0.025, +0.006, +0.084, -0.056, -0.068, -0.048, +0.079, -0.096, +0.085, -0.100, -0.006, +0.053, +0.033, -0.016, -0.050, -0.061, -0.080, -0.004, -0.082, +0.009, +0.029, -0.051}, {-0.100, +0.095, -0.073, -0.089, +0.002, +0.068, -0.014, -0.002, -0.038, +0.098, +0.019, -0.054, -0.021, +0.076, -0.089, -0.025, +0.033, -0.063, -0.011, -0.032, -0.019, -0.050, +0.014, -0.070}, {-0.011, +0.093, +0.030, -0.076, -0.051, -0.060, -0.003, +0.032, +0.025, -0.003, +0.003, -0.043, -0.009, -0.077, +0.002, +0.022, +0.038, -0.033, +0.000, -0.028, +0.047, -0.060, -0.012, +0.094}, {+0.061, +0.093, +0.038, -0.087, -0.027, +0.017, -0.028, -0.087, +0.000, -0.092, -0.035, -0.045, +0.040, -0.052, -0.015, +0.022, -0.033, -0.098, +0.070, +0.022, +0.058, -0.075, -0.027, -0.039}, {-0.093, -0.039, +0.008, +0.070, +0.088, +0.054, +0.016, -0.005, -0.009, +0.037, +0.019, -0.056, -0.071, +0.026, -0.092, -0.093, +0.087, -0.069, -0.071, +0.032, -0.009, +0.010, +0.022, -0.053}, {-0.049, -0.052, +0.013, -0.047, -0.077, +0.012, -0.012, +0.091, +0.006, +0.075, -0.029, +0.007, -0.049, -0.013, -0.015, -0.065, +0.047, -0.075, +0.096, -0.042, -0.023, +0.058, -0.037, -0.054}, {-0.001, +0.033, +0.030, +0.067, -0.028, -0.039, +0.044, -0.031, +0.096, +0.025, -0.002, +0.013, +0.034, -0.075, -0.037, +0.009, -0.004, -0.038, +0.083, -0.073, +0.094, -0.052, -0.010, +0.006}, {-0.002, -0.061, +0.099, -0.023, -0.078, -0.080, +0.050, -0.052, -0.052, -0.017, +0.017, -0.012, -0.089, +0.058, -0.079, -0.082, +0.084, -0.021, +0.084, -0.053, +0.002, +0.092, -0.099, -0.033}, {-0.024, -0.084, +0.091, +0.002, +0.026, +0.065, +0.009, +0.054, +0.048, +0.032, +0.031, -0.026, +0.023, +0.090, +0.093, +0.022, -0.047, +0.046, +0.043, +0.056, -0.079, -0.078, +0.018, +0.022}, {-0.051, +0.056, -0.046, -0.038, +0.065, +0.002, -0.049, -0.100, -0.064, +0.075, -0.032, -0.072, +0.038, -0.074, -0.003, -0.022, +0.036, -0.010, -0.029, +0.020, -0.021, +0.035, -0.017, +0.086},};
	public static double RATES[][] = {OPEN, LOW, HIGH, CLOSE};
}
