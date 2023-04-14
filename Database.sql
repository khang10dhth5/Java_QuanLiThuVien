CREATE DATABASE QUANLITV
ON PRIMARY
(
	NAME=QuanLyTV,
	FILENAME='E:\QuanLiTV.mdf',
	SIZE=5MB,
	MAXSIZE = 200MB,
    FILEGROWTH = 10%
)
LOG ON
(
	NAME=QuanLyTV_log,
	FILENAME='E:\QuanLiTV.ldf',
	SIZE=5MB,
	MAXSIZE=Unlimited,
	FILEGROWTH=15%
)

USE QUANLITV
GO 

CREATE TABLE TACGIA
(
MATG int Identity(1,1) NOT NULL PRIMARY KEY,
TENTG NVARCHAR(50),
GHICHU NVARCHAR(2000)
)
CREATE TABLE THELOAI
(
MATL int Identity(1,1) NOT NULL PRIMARY KEY,
TENTL NVARCHAR(100)
)
CREATE TABLE NXB
(
MANXB int Identity(1,1) NOT NULL PRIMARY KEY,
TENNXB NVARCHAR(100),
DIACHI NVARCHAR(100),
SDT NVARCHAR(15)
)
CREATE TABLE SACH
(
MASH int Identity(1,1) PRIMARY KEY,
TENSH NVARCHAR(200),
MATG int,
MATL int,
MANXB int,
NAMXB INT,
CONLAI INT,
CONSTRAINT FK_SACH_TACGIA FOREIGN KEY(MATG) REFERENCES TACGIA(MATG),
CONSTRAINT FK_SACH_THELOAI FOREIGN KEY(MATL) REFERENCES THELOAI(MATL),
CONSTRAINT FK_SACH_NXB FOREIGN KEY(MANXB) REFERENCES NXB(MANXB)
)
CREATE TABLE DOCGIA
(
MADG int Identity(1,1) NOT NULL PRIMARY KEY,
TENDG NVARCHAR(100),
SDT NVARCHAR(15),
DIACHI NVARCHAR(100),
SLMUON INT
)
CREATE TABLE QUANLY
(

MAQL int Identity(1,1) NOT NULL PRIMARY KEY,
TAIKHOAN NVARCHAR(100),
MATKHAU NVARCHAR(20),
TENQL NVARCHAR(100),
SDT NVARCHAR(15),
DIACHI NVARCHAR(50)
)
CREATE TABLE MUONTRA
(
MAMT int Identity(1,1) NOT NULL PRIMARY KEY,
MADG INT,
MAQL INT,
NGMUON DATE,
NGTRA DATE,
CONSTRAINT FK_MUONTRA_DOCGIA FOREIGN KEY (MADG) REFERENCES DOCGIA(MADG),
CONSTRAINT FK_MUONTRA_QUANLI FOREIGN KEY (MAQL) REFERENCES QUANLY(MAQL)
)

CREATE TABLE CTMUONTRA
(
MAMT INT NOT NULL,
MASH INT NOT NULL,

TIENPHAT MONEY,
GHICHUPHAT NVARCHAR(30),
CONSTRAINT PK_CTMUONTRA PRIMARY KEY(MAMT,MASH),
CONSTRAINT FK_CTMUONTRA_MUONTRA FOREIGN KEY(MAMT) REFERENCES MUONTRA(MAMT),
CONSTRAINT FK_CTMUONTRA_SACH FOREIGN KEY (MASH) REFERENCES SACH(MASH)
)
INSERT INTO TACGIA
VALUES(N'Isayama Hajime',N'sinh ngày 29 tháng 8 năm 1986) 
là một họa sĩ truyện tranh Nhật Bản. Hajime đã cho ra mắt 
"bom tấn" manga nổi tiếng toàn cầu Shingeki no Kyojin vào 
năm 2009 và tập thứ27 được biên soạn tại Nhật Bản vào ngày
7 tháng 12 năm 2019. Kodansha Comics đã xuất bản bộ truyện
tranh bằng tiếng Anh. Manga cũng đã được chuyển thể thành
anime, live action, vở kịch và nhiều tác phẩm khác. Bộ truyện 
đầu tiên và hiện đang diễn ra của anh, Shingeki no Kyojin, 
đã trở thành một trong những bộ manga bán chạy nhất mọi thời 
đại với 90 triệu bản được lưu hành vào tháng 4 năm 2019.'),
(N'Aoyama Gōshō',N'sinh ngày 21 tháng 6 năm 1963 tại Hokuei 
tỉnh Tottori, Nhật Bản (trước đây còn được biết tới là Daiei, 
tỉnh Tottori). Ông là một nhà sáng tác truyện tranh, người 
được biết đến với bộ truyện tranh Thám tử lừng danh Conan.'),
(N'Fujiko Fujio',N' là bút danh chung của hai nghệ sĩ manga 
Nhật Bản, người Việt gọi là Ông Hai Phú hay Ông Phú Sĩ. Tên 
thật của họ là Fujimoto Hiroshi (藤本 弘 (Đằng Bản Hoằng) 
1933–1996?) và Abiko Motoo (安孫子 素雄 (An Tôn Tử Tố Hùng) 
1934–?). Năm 1954, hai người đều dùng cái tên "Fujiko Fujio" 
cho tới năm 1987, họ chia tay để theo đuổi con đường sáng tác 
riêng lẻ và trở thành "Fujiko F. Fujio" và "Fujiko Fujio "'),
(N'Toriyama Akira',N'sinh ngày 5 tháng 4 năm 1955 tại Nagoya, 
Aichi, Nhật Bản. Ông là một tác giả manga Nhật Bản, nổi tiếng 
với tác phẩm Dragon Ball và Dr. Slump. Nét vẽ của ông có ảnh 
hưởng từ hai bộ Astro Boy (Osamu Tezuka) và 101 con chó đốm 
(Walt Disney).'),
(N'Kishimoto Masashi',N'là một họa sĩ truyện tranh đã được 
biết đến qua bộ truyện tranh nổi tiếng thế giới Naruto. Người 
em song sinh của Masashi, Kishimoto Seishi, cũng là một họa 
sĩ truyện tranh, tác giả của 666 Satan và Blazer Drive'),
(N'Oda Eiichiro',N'là một họa sĩ truyện tranh người Nhật Bản, 
hiện đang sáng tác cho nhà xuất bản Shūeisha. Ông là tác giả 
của bộ truyện nổi tiếng thế giới One Piece.'),
(N'Hiroki Adachi',N'Adachi là họa sĩ truyện tranh nổi tiếng 
với khả năng xây dựng tình huống và tâm lý nhân vật xuất sắc. 
Các tác phẩm của ông chủ yếu viết về thể thao và lứa tuổi mới 
lớn.'),
(N'Usui Yoshito',N'là một hoa sĩ truyện tranh người Nhật, tác 
giả của bộ truyện tranh nổi tiếng Shin - cậu bé bút chì. Ông 
sinh ra ở thành phố Shizuoka, tỉnh Shizuoka, Nhật Bản.'),
(N'Inagaki Riichiro',N'là một nhà văn truyện tranh Nhật Bản 
đến từ Tokyo . Anh bắt đầu sự nghiệp của mình vào năm 2001 
khi xuất bản các tác phẩm cho tạp chí Big Comic Spirits của 
Shogakukan . Sau ba một bức ảnh , ông chuyển đến Shueisha s 
Weekly Shōnen Jump , trong đó ông bắt đầu công việc ông được 
biết đến nhiều nhất, Eyeshield 21 . Với sự hợp tác của nghệ 
sĩ Yusuke Murata , Eyeshield 21 được phát hành nhiều kỳ từ 
tháng 7 năm 2002 đến tháng 6 năm 2009 trongTuần san Shōnen 
Jump . Từ năm 2010 đến năm 2015, Inagaki hợp tác với một số 
nghệ sĩ, bao gồm Bonjae, Katsunori Matsui và Ryoichi Ikegami , 
và xuất bản một bức ảnh trên các tạp chí khác nhau. Anh bắt 
đầu một loạt phim mới có tựa đề Dr. Stone trên Weekly Shōnen 
Jump vào năm 2017 với sự hợp tác của Boichi .'),
(N'Hideaki Sorachi',N'là bút danh [2] của một họa sĩ truyện 
tranh Nhật Bản được biết đến với tên gọi Gin Tama . [3] Tính 
đến tháng 5 năm 2016 , manga Gin Tama đã bán được 50 triệu bản 
tại Nhật Bản .'),
(N'Tabata Yuki',N' là một họa sĩ truyện tranh Nhật Bản . 
Sau khi làm trợ lý cho Toshiaki Iwashiro , anh đã tạo ra 
Hungry Joker trong một shot , sau này được đăng nhiều kỳ 
thành một loạt phim đầy đủ. Sau khi kết thúc, anh ta tung 
ra Black Clover .'),
(N'Gotouge Koyoharu',N'sinh ngày 5/5/1989, là một mangaka 
người Nhật Bản và là tác giả của bộ truyện tranh Thanh gươm 
Diệt Quỷ: Kimetsu no Yaiba. Gotouge dùng hình ảnh một con 
cá sấu đeo kính khi thông báo những thông tin quan trọng về
 series hoặc về mình tới độc giả.'),
(N'Watsuki Nobuhiro',N'là một mangaka (tác giả manga), nổi
 tiếng nhất với seri lấy chủ đề samurai Rurouni Kenshin. 
 Ông đã tùng làm trợ lý cho tác giả yêu thích của mình là 
 Obata Takeshi, và bị ảnh hưởng bởi truyện tranh Siêu anh 
 hùng như X-Men, Spider-Man, Hulk và Spawn khi sáng tạo ra 
 các nhân vật.'),
(N'Adachi Toka',N'là bút danh chung được sử dụng bởi các 
nữ họa sĩ truyện tranh Adachi (あ だ ち, sinh ngày 14 tháng 
12) và Tokashiki (と か し き, sinh ngày 28 tháng 11) . Cái
trước vẽ tiền cảnh và các ký tự, trong khi cái sau vẽ hậu 
cảnh.'),
(N'Ohtaka Shinobu',N'là một họa sĩ truyện tranh Nhật Bản .
Cô được biết đến với việc tạo ra loạt manga Sumomomo Momomo
 và Magi: The Labyrinth of Magic .'),
(N'Kamio Yoko',N'là một mangaka và nhà văn người Nhật.
Cô nổi tiếng với bộ truyện tranh Con nhà giàu (花より男子
Hana Yori Dango?), với tác phẩm này cô đã nhận được giải
thưởng Shogakukan Manga Award vào năm 1996.[1] Tác phẩm 
này của cô ấy đã được dịch và xuất bản rộng rãi ở châu Á,
châu Âu và Bắc Mĩ.'),
(N'Takahashi Yōichi',N'là một họa sĩ truyện tranh Nhật Bản.
Một trong những tác phẩm nổi tiếng của ông là Captian Tsubasa.
Takahashi từng xuất bản nhiều sách nghệ thuật, manga, tiểu 
thuyết và sách hướng dẫn liên quan đến bộ manga Giấc mơ sân 
cỏ. Ông cũng khá nổi tiếng với sêri bóng đá Hungry Heart: 
Wild Striker.'),
(N'Kugane Maruyama',N'là một tiểu thuyết gia người Nhật Bản 
và là tác giả của Overlord . Overlord sau đó đã được chuyển 
thể thành manga và anime .'),
(N'Kubo Taito',N'Kubo sinh ngày 26/6/1977 tại tỉnh Hiroshima, 
nơi cha ông làm việc như một thành viên hội đồng thị trấn. Ở 
trường tiểu học, ông đã quyết định trở thành một nghệ sĩ manga,
do đọc manga Saint Seiya. Yomikiri đầu tiên của ông là "Ultra 
Unholy Hearted Machine", viết cho Weekly Shōnen Jump năm 1996.
Ông đã viết bộ truyện tranh đầu tiên Zombiepowder, cũng được 
xuất bản trong Weekly Shōnen Jump năm 1999. Nó đã chạy 27 chương
ngắn trước khi bị hủy bỏ vào năm 2000. Theo bình luận của tác giả,
Kubo đã trong trạng thái tổn thương tinh thần nghiêm trọng khi 
ông viết nó.'),
(N'Tappei Nagatsuki',N'Tappei Nagatsuki (長 月 達 平, Nagatsuki 
Tappei) là tác giả và biên kịch chính của chuyển thể anime gốc, 
Vivy: Fluorite Eyes Song .Ông là một nhà văn viết tiểu thuyết 
Nhật Bản, người chủ yếu được biết đến với vai trò là tác giả của
loạt tiểu thuyết Re: Zero Kara Hajimeru Isekai Seikatsu.'),
(N'Asō Shūichi',N'Shuuichi Asou là một mangaka và là tác giả,
họa sĩ và nhà văn của manga Saiki Kusuo no Sai Nan .'),
(N'Takashi Shiina','(椎 名 高志, Shiina Takashi , sinh ngày 
24 tháng 6 năm 1965) là một họa sĩ truyện tranh Nhật Bản , người
chủ yếu viết cho ấn phẩm manga Shogakukan hàng tuần Weekly Shōnen 
Sunday . Khi bắt đầu làm việc tại công ty vào năm 1989, anh ấy bắt 
đầu với một tuyển tập gồm nhiều loại quần short và one-shot khác 
nhau được gọi chung là Cửa hàng bách hóa Shiina . Cuối cùng thì 
một trong những cảnh quay này, kể về một nữ trừ tà xinh đẹp, hám 
tiền và người bạn đồng hành dâm đãng của cô ấy, sẽ trở thành cơ 
sở cho tác phẩm nổi tiếng nhất của ông: Ghost Sweeper Mikami : 
Gokuraku Daisakusen !! (được biết đến với tên ngắn hơn: Ghost 
Sweeper Mikami, hay GS Mikami ) Chạy từ năm 1991 đến năm 1999, 
nó đã trở thành tác phẩm nổi tiếng và được yêu thích vào Chủ nhật ,
dẫn đến một anime của bộ từ năm 1993 đến năm 1994 bởi Toei Animation
cũng như Giải thưởng Shogakukan Manga dành cho shōnen vào năm 1993.
Ngay cả khi đã thành công với Mikami , Shiina vẫn tiếp tục tạo ra
nhiều câu chuyện ngắn khác nhau bên cạnh bộ truyện chính của mình.'),
(N'Kaiu Shirai',N'là bút danh của một người Nhật mangaka và nhà 
văn mà tên thật và ngày sinh chưa được biết.'),
(N'Iro Aida',N'Iro Aida là tác giả của bộ manga: Jibaku shounen 
hanako-kun. Iro Aida thực chất là 2 người, Iro là người viết nội 
dung cho truyện, còn Aida là người vẽ truyện. Họ cùng nhau tạo ra 
Jibaku Shounen Hanako-kun. Có một style vẽ khá đặc bt và ấn tượng 
trong nhân vật'),
(N'Kousuke Oono',N'(Ōno Kōsuke) người tạo ra Gokushufudou'),
(N'Vũ Trọng Phụng',N'(1912-1939) là một nhà văn, nhà báo nổi 
tiếng của Việt Nam vào đầu thế kỷ 20. Tuy thời gian cầm bút rất 
ngắn ngủi, với tác phẩm đầu tay là truyện ngắn Chống nạng lên 
đường đăng trên Ngọ báo vào năm 1930, ông đã để lại một kho 
tác phẩm đáng kinh ngạc: hơn 30 truyện ngắn, 9 tập tiểu thuyết, 
9 tập phóng sự, 7 vở kịch, cùng một bản dịch vở kịch từ tiếng Pháp, 
một số bài viết phê bình, tranh luận văn học và hàng trăm bài báo 
viết về các vấn đề chính trị, xã hội, văn hóa[1]. Một số trích 
đoạn tác phẩm của ông trong các tác phẩm Số đỏ và Giông Tố đã 
được đưa vào sách giáo khoa môn Ngữ văn của Việt Nam'),
(N'Tô Hoài',N'(tên khai sinh: Nguyễn Sen; 27 tháng 9 năm 1920 
– 6 tháng 7 năm 2014)[1] là một nhà văn Việt Nam. Một số tác 
phẩm đề tài thiếu nhi của ông được dịch ra ngoại ngữ. Ông được 
nhà nước Việt Nam trao tặng Giải thưởng Hồ Chí Minh về Văn học 
– Nghệ thuật Đợt 1 (1996) cho các tác phẩm: Xóm giếng, Nhà nghèo,
O chuột, Dế mèn phiêu lưu ký, Núi Cứu quốc, Truyện Tây Bắc, Mười
năm, Xuống làng, Vỡ tỉnh, Tào lường, Họ Giàng ở Phìn Sa, Miền 
Tây,Vợ chồng A Phủ, Tuổi trẻ Hoàng Văn Thụ.'),
(N'Nguyễn Huy Tưởng',N' (1912 – 1960) là một nhà văn, nhà viết 
kịch Việt Nam nổi tiếng. Ông là tác giả của những tiểu thuyết 
lịch sử, vở kịch lớn như: Vũ Như Tô, Đêm hội Long Trì, Bắc Sơn,
Sống mãi với thủ đô.'),
(N'Nguyên Hồng',N'Nguyên Hồng (1918–1982), tên thật của ông 
là Nguyễn Nguyên Hồng, là một nhà văn, nhà thơ Việt Nam.'),
(N'Nguyễn Nhật Ánh',N'(sinh ngày 7 tháng 5 năm 1955)[1] là 
một nhà văn Việt Nam. Ông được biết đến qua nhiều tác phẩm văn
học về đề tài tuổi trẻ, các tác phẩm của ông rất được độc giả 
ưa chuộng và nhiều tác phẩm đã được chuyển thể thành phim.'),
(N'Xuân Quỳnh',N'Xuân Quỳnh (1942–1988), tên đầy đủ là Nguyễn 
Thị Xuân Quỳnh, là một nữ nhà thơ người Việt Nam. Bà nổi tiếng 
với nhiều bài thơ được nhiều người biết đến như Thuyền và biển, 
Sóng, Thơ tình cuối mùa thu, Tiếng gà trưa. Bà được Nhà nước 
Việt Nam truy tặng Giải thưởng Nhà nước và Giải thưởng Hồ Chí 
Minh vì những thành tựu cho nền văn học Việt Nam.'),
(N'Đoàn Giỏi','(17 tháng 5 năm 1925 - 2 tháng 4 năm 1989), 
là một nhà văn Việt Nam, hội viên Hội Nhà văn Việt Nam từ 
năm 1957. Ông có những bút danh khác như: Nguyễn Hoài, Nguyễn 
Phú Lễ, Huyền Tư.Các tác phẩm của Đoàn Giỏi thường viết về
cuộc sống, thiên nhiên và con người ở Nam Bộ. Tác phẩm "Đất 
rừng phương Nam" là một trong những tác phẩm nổi tiếng của 
Đoàn Giỏi.Tác phẩm này được lấy một đoạn để cho vào sách 
giáo khoa lớp 6.'),
(N'Phùng Quán',N'Phùng Quán (1932–1995) là một nhà văn, nhà
thơ Việt Nam, bắt đầu viết trong khoảng thời gian của cuộc 
chiến tranh Đông Dương và khẳng định được văn tài với Vượt 
Côn Đảo nhưng ông được biết đến nhiều hơn sau Đổi mới. Ông 
là cháu gọi Tố Hữu bằng cậu (Tố Hữu với mẹ của Phùng Quán là 
hai anh em cô cậu ruột, theo cách gọi của người miền Bắc là 
bác).'),
(N'Hồ Chí Minh',N'(Chữ Nho: 胡志明; 19 tháng 5 năm 1890 – 
2 tháng 9 năm 1969), tên khai sinh là Nguyễn Sinh Cung (Chữ 
Nho: 阮生恭), là một nhà cách mạng và chính khách người Việt 
Nam. Ông là người sáng lập ra Đảng Cộng sản Việt Nam, từng 
là Thủ tướng Việt Nam Dân chủ Cộng hòa trong những năm 
1945–1955 và là Chủ tịch nước Việt Nam Dân chủ Cộng hòa từ 
năm 1951 đến khi qua đời. Ở Việt Nam, ông thường được gọi 
là Bác Hồ.'),
(N'Nguyễn Công Hoan',N'Nguyễn Công Hoan quê ở làng Xuân 
Cầu, tổng Xuân Cầu, huyện Văn Giang, phủ Thuận Thành, tỉnh 
Bắc Ninh (nay thuộc xã Nghĩa Trụ, huyện Văn Giang, tỉnh Hưng 
Yên). Ông sinh trong một gia đình quan lại xuất thân Nho học 
thất thế. Trong gia đình, từ nhỏ Nguyễn Công Hoan đã được nghe 
và thuộc rất nhiều câu thơ, câu đối và những giai thoại có tính 
chất trào lộng, châm biếm, đả kích tầng lớp quan lại. Điều đó ảnh 
hưởng mạnh mẽ đến phong cách văn chương của ông sau này. Ông có
ba người em trai đều tham gia hoạt động cách mạng và giữ cương 
vị quan trọng là Nguyễn Công Miều (Lê Văn Lương) nguyên Ủy viên 
Bộ Chính trị, Nguyễn Công Bồng nguyên Phó Tổng Giám đốc Nha Công 
an và Nguyễn Công Mỹ nguyên Tổng Giám đốc đầu tiên của Nha bình 
dân học vụ.'),
(N'Trần Đăng Khoa',N'(sinh ngày 26 tháng 4 năm 1958), quê 
làng Trực Trì, xã Quốc Tuấn, huyện Nam Sách, tỉnh Hải Dương, 
là một nhà thơ, nhà báo, biên tập viên Tạp chí Văn nghệ Quân 
đội, Phó chủ tịch Hội Nhà văn Việt Nam. Ông nguyên là Trưởng 
ban Văn học Nghệ thuật, Giám đốc Hệ Phát thanh có hình VOVTV 
của Đài tiếng nói Việt Nam, Phó Bí thư thường trực Đảng ủy Đài 
Tiếng nói Việt Nam[3]. Hiện nay, ông giữ chức Phó Chủ tịch Hội 
Nhà văn Việt Nam, Phó Chủ tịch Liên hiệp VHNT Hà Nội. Ông cũng là 
Trưởng Ban Chung khảo, Hội đồng Giám khảo Quốc gia của cuộc thi 
Viết thư quốc tế UPU tại Việt Nam từ năm 2016 đến nay, thay cho 
Phó chủ tịch Hội Nhà văn Việt Nam (Nguyễn Trí Huân).')

INSERT INTO THELOAI
VALUES(N'Truyện Tranh/Comic'),
(N'Văn Học'),
(N'Sách Chuyên Ngành'),
(N'Sách Chính trị – pháp luật'),
(N'Sách Khoa học công nghệ – Kinh tế'),
(N'Sách Văn học nghệ thuật'),
(N'Sách Văn hóa xã hội – Lịch sử'),
(N'Sách Giáo trình'),
(N'Sách Truyện, tiểu thuyết'),
(N'Sách Tâm lý, tâm linh, tôn giáo'),
(N'Sách Sách thiếu nhi')

INSERT INTO NXB
VALUES(N'Nhà Xuất Bản Trẻ',N'TPHCM','9789797'),
(N'Nhà Xuất Bản Kim Đồng',N'Hà Nội','6784544'),
(N'Nhà Xuất Bản Hà Nội',N'Hà Nội','6756846'),
(N'Nhà Xuất Bản Hồng Đức',N'Hà Nội','2600024'),
(N'Nhà Xuất Bản Nông nghiÖp',N'Hà Nội','6784544'),
(N'Nhà Xuất Bản Quân đội nhân dân ',N'Hà Nội','6756846'),
(N'Nhà Xuất Bản Chính trị Quốc gia - Sự thật',N'Hà Nội','2600024'),
(N'Nhà Xuất Bản Fahasa Cần Thơ',N'Hà Nội','6784544'),
(N'Nhà Xuất Bản Tổng hợp Tp.HCM',N'Hà Nội','6756846'),
(N'Nhà Xuất Bản Văn Hoá - Văn Nghệ Tp. HCM',N'Hà Nội','2600024'),
(N'Nhà Xuất Bản Khoa Học Xã Hội',N'Hà Nội','6784544'),
(N'Nhà Xuất Bản Thế Giới',N'Hà Nội','6756846'),
(N'Nhà Xuất Bản Sách 100',N'Hà Nội','2600024')

SET DATEFORMAT DMY
INSERT INTO SACH
VALUES(N'Shingeki no kyojin',1,2,1,2021,33),
(N'Thám Tử Conan tập 96',2,1,2,2021,24),
(N'Thám Tử Conan tập 80',2,1,2,2013,21),
(N'Thám Tử Conan tập 87',2,1,2,2015,6),
(N'Magic Kaito tập 1',2,1,2,2000,8),
(N'Magic Kaito tập 2',2,1,2,2015,12),
(N'Magic Kaito tập 5',2,1,2,2001,23),
(N'Yaiba tập 12',2,1,2,2015,6),
(N'Yaiba tập 15',2,1,2,2000,8),
(N'Yaiba tập 17',2,1,2,2015,12),
(N'Doraemon:Chú khủng 
long của Nobita',3,1,2,1980,3),
(N'Doraemon:Nobita và lịch sử khai phá vũ trụ',3,1,2,2005,3),
(N'Doraemon:Nobita thám hiểm vùng đất mới',3,1,2,1980,3),
(N'Doraemon:Nobita và cuộc chiến vũ trụ',3,1,2,2005,3),
(N'Doraemon:Nobita và Vương quốc trên mây',3,1,2,2005,3),
(N'Doraemon:Đấng toàn năng Nobita',3,1,2,2005,3),
(N'Dragon Ball Super 5',4,1,2,2015,34),
(N'Dragon Ball Super 7',4,1,2,2015,5),
(N'Dragon Ball Super 1',4,1,2,2018,5),
(N'Dragon Ball Super 2',4,1,2,2019,32),
(N'naruto: the worst client',5,1,2,2019,31),
(N'naruto: challengers',5,1,2,2017,11),
(N'naruto: Naruto Artbook 2',5,1,2,2019,21),
(N'naruto: life-and-death battles',5,1,2,2021,31),
(N'One Piece - Tập 65',6,1,2,2021,31),
(N'One Piece - Tập 68',6,1,2,2021,36),
(N'One Piece - Tập 63',6,1,2,2020,31),
(N'One Piece - Tập 61',6,1,2,2020,34),
(N'One Piece - Tập 69',6,1,2,2021,31),
(N'hero horimiya, vol. 9',7,1,2,2021,37),
(N'hero horimiya, vol. 1',7,1,2,2021,21),
(N'hero horimiya, vol. 2',7,1,3,2017,33),
(N'hero horimiya, vol. 3',7,1,1,2018,14),
(N'Shin – Cậu bé bút chì tập 8',8,1,1,2018,14),
(N'Shin – Cậu bé bút chì tập 8',8,1,3,2018,19),
(N'Shin – Cậu bé bút chì tập 8',8,1,5,2018,12),
(N'Shin – Cậu bé bút chì tập 8',8,1,3,2018,14),
(N'Tiến sĩ Đá - Tập 6',9,1,3,2018,13),
(N'Tiến sĩ Đá - Tập 7',9,1,3,2012,17),
(N'Tiến sĩ Đá - Tập 9',9,1,3,2013,11),
(N'Tiến sĩ Đá - Tập 10',9,1,3,2017,1),
(N'gin tama, vol. 5',10,1,3,2018,14),
(N'gin tama, vol. 7',10,1,2,2019,18),
(N'gin tama, vol. 4',10,1,4,2017,14),
(N'gin tama, vol. 1',10,1,3,2018,25),
(N'gin tama, vol. 3',10,1,3,2014,11),
(N'black clover, vol. 1',11,1,4,2018,11),
(N'black clover, vol. 2',11,1,4,2018,12),
(N'black clover, vol. 3',11,1,4,2019,13),
(N'black clover, vol. 4',11,1,4,2012,11),
(N'black clover, vol. 5',11,1,4,2011,32),
(N'Thanh gươm diệt quỷ - Tập 9',12,1,4,2018,11),
(N'Thanh gươm diệt quỷ - Tập 1',12,1,4,2017,11),
(N'Thanh gươm diệt quỷ - Tập 21',12,1,4,2017,21),
(N'Thanh gươm diệt quỷ - Tập 15',12,1,3,2018,51),
(N'Thanh gươm diệt quỷ - Tập 13',12,1,3,2019,11),
(N'Thanh gươm diệt quỷ - Tập 12',12,1,3,2020,21),
(N'Thanh gươm diệt quỷ - Tập 16',12,1,3,2021,13),
(N'rurouni kenshin, vol. 4',13,1,3,2021,13),
(N'rurouni kenshin, vol. 3',13,1,3,2020,15),
(N'rurouni kenshin, vol. 2',13,1,3,2019,13),
(N'Nogarami',14,1,3,2021,12),
(N'Alive - The Final Evolution',14,1,3,2021,12),
(N'the labyrinth of magic, vol. 3',15,1,3,2020,12),
(N'the labyrinth of magic, vol. 2',15,1,3,2020,13),
(N'the labyrinth of magic, vol. 1',15,1,3,2021,16),
(N'the labyrinth of magic, vol. 5',15,1,3,2020,11),
(N'boys over flowers 28',16,1,3,2001,12),
(N'boys over flowers 27',16,1,3,2001,12),
(N'boys over flowers 29',16,1,3,2001,17),
(N'boys over flowers 21',16,1,3,2001,12),
(N'captain tsubasa',17,1,3,2001,12),
(N'captain tsubasa golden 23',17,1,3,2003,12),
(N'captain tsubasa 2',17,1,3,2007,19),
(N'captain tsubasa 3',17,1,3,2002,12),
(N'Overlord - Tập 2: The Dark Warrior Kugane Maruyama',18,1,3,2002,13),
(N'Overlord - Tập 4',18,1,3,2002,12),
(N'Overlord - Tập 12',18,1,3,2001,15),
(N'Overlord - Tập 5',18,1,3,2008,11),
(N'bleach, vol. 12',19,1,3,2008,12),
(N'bleach, vol. 13',19,1,3,2008,12),
(N'bleach, vol. 14',19,1,3,2001,17),
(N'bleach, vol. 15',19,1,3,2004,16),
(N'Re:Zero − Bắt đầu lại ở thế giới khác - Tập 8',20,1,3,2008,12),
(N'Re:Zero − Bắt đầu lại ở thế giới khác - Tập 9',20,1,3,2008,12),
(N'Re:Zero − Bắt đầu lại ở thế giới khác - Tập 10',20,1,3,2008,12),
(N'Re:Zero − Bắt đầu lại ở thế giới khác - Tập 7',20,1,3,2017,12),
(N'Re:Zero − Bắt đầu lại ở thế giới khác - Tập 6',20,1,3,2019,12),
(N'Shinseiki Idol Densetsu: Kanata Seven Change',21,1,4,2020,12),
(N'zettai karen children, tome 33',22,1,4,2020,12),
(N'zettai karen children, tome 34',22,1,4,2020,13),
(N'zettai karen children, tome 35',22,1,4,2020,16),
(N'Miền đất hứa - Tập 7',23,1,4,2020,12),
(N'Miền đất hứa - Tập 8',23,1,4,2020,15),
(N'Miền đất hứa - Tập 9',23,1,4,2021,12),
(N'Miền đất hứa - Tập 4',23,1,4,2021,17),
(N'Miền đất hứa - Tập 5',23,1,4,2020,12),
(N'Dear My Living Dead.',24,1,4,2021,16),
(N'Jibaku Shounen Hanako-kun - Pilot',24,1,4,2021,16),
(N'Houkage Shounen Hanako-kun ',24,1,4,2021,16),
(N'the way of the househusband, vol. 4',25,1,4,2021,16),
(N'the way of the househusband, vol. 1',25,1,4,2021,16),
(N'the way of the househusband, vol. 3',25,1,6,2021,16),
(N'Số đỏ',26,3,3,2015,16),
(N'Giông tố',26,3,3,2015,16),
(N'Vỡ đê',26,3,3,2015,16),
(N'Lục xi',26,3,3,2015,16),
(N'Cạm bẫy Người',26,3,3,2015,16),
(N'Dế Mèn phiêu lưu ký',27,4,5,2015,16),
(N'Chiều Chiều',27,4,5,2015,16),
(N'Chiếc áo xường xám màu hoa đào',27,4,5,2015,16),
(N'Giữ gìn 36 phố phường',27,4,5,2015,16),
(N'Truyên Nơ',27,4,5,2015,16),
(N'Sống mãi với thủ đô',28,4,5,1999,16),
(N'An Dương Vương xây thành Ốc',28,4,5,1922,16),
(N'Đêm hội Long Trì',28,4,5,1967,16),
(N'Chuyện Tôi-Hồi ức của con trai',28,4,5,1935,16),
(N'Những ngày thơ ấu',29,4,5,1938,16),
(N'Một Tuổi Thơ Văn',29,4,5,1938,16),
(N'Dưới Chân Cầu Mây',29,4,5,1938,16),
(N'Bước Đường Viết Văn',29,4,5,1938,16),
(N'Cho tôi xin một vé đi tuổi thơ',30,5,6,1998,17),
(N'Tôi thấy hoa vàng trên cỏ xanh',30,5,6,1998,17),
(N'Mắt biếc',30,5,6,1998,17),
(N'Cô Gái Đến Từ Hôm Qua',30,5,6,1998,17),
(N'Tôi là Bêtô',30,5,6,1998,17),
(N'Còn chút gì để nhớ',30,5,6,1998,17),
(N'Bồ câu không đưa thư',30,5,6,1998,17),
(N'Bầu Trời Trong Quả Trứng',31,5,6,1956,13),
(N'Hoa Mận Trắng Xuân Quỳnh',31,5,6,1956,13),
(N'Không Bao Giờ Là Cuối',31,5,6,1956,13),
(N'Nêu ngày mai... Si demain...',31,5,6,1956,13),
(N'Đất rừng phương Nam',32,5,6,1957,13),
(N'Cuộc Truy Tầm Kho Vũ Khí',32,5,6,1957,13),
(N'Những Chuyện Lạ Về Cá',32,5,6,1957,13),
(N'Người thủy thủ già trên hòn đảo lưu đày',32,5,6,1957,13)
select *from SACH


INSERT INTO DOCGIA
VALUES(N'Lê Văn Hường',N'08390438',N'Quảng Ninh',1),
(N'Nguyễn Văn Phú Lê',N'0890438',N'Cà Mau',1),
(N'Hồ Văn Tông',N'0890434',N'Tây Ninh',1),
(N'Lê Công Trạch',N'08545646',N'Quảng Ninh',1),
(N'Nguyễn Phú Nhuận',N'08943543',N'Cà Mau',1),
(N'Lê Lâm Trường',N'0890438',N'Quảng Ninh',1),
(N'Nguyễn Văn Tiến',N'0890438',N'Cà Mau',1),
(N'Hồ Tiến Học',N'083490438',N'Tây Ninh',1),
(N'Lê Đại Hành',N'087490438',N'Quảng Ninh',1),
(N'Nguyễn Trọng Đại',N'0834590438',N'Cà Mau',1),
(N'Hồ Trung Trực',N'085790438',N'Tây Ninh',1),
(N'Lê Thiện',N'0890438',N'TP HCM',1),
(N'Nguyễn Trần Công',N'0890438',N'Hà Nội',1),
(N'Hồ Danh Lợi',N'0890438',N'Hải Dương',1),
(N'Hồ Danh Trung',N'0890438',N'Tây Ninh',1),
(N'Hồ Rang Phan',N'085790438',N'Tây Ninh',1),
(N'Lê Thiện Nhân',N'0890438',N'TP HCM',1),
(N'Nguyễn Trần Đại',N'0435890438',N'Hà Nội',1),
(N'Hồ Công Danh',N'0890438',N'Hải Dương',1),
(N'Hồ Ông Cung',N'0890438',N'Tây Ninh',1),
(N'Hồ Dầu Tiến',N'085790438',N'Tây Ninh',1),
(N'Lê Đại Nhân',N'0890438',N'TP HCM',1),
(N'Nguyễn Bá Kiện',N'0890438',N'Hà Nội',1),
(N'Hồ Chi Linh',N'0890438',N'Hải Dương',1),
(N'Mã Danh Vinh',N'0890438',N'Tây Ninh',1),
(N'Hồ Văn Vinh',N'085790438',N'Tây Ninh',1),
(N'Lê Hữu Đạt',N'0890438',N'TP HCM',1),
(N'Nguyễn Trần Lập',N'0890438',N'Hà Nội',1),
(N'Hồ Thái Chung',N'0890438',N'Hải Dương',1),
(N'Hồ Quang Hiếu',N'0890438',N'Tây Ninh',1),
(N'Mã Đại Thanh',N'0890438',N'Tây Ninh',1),
(N'Hồ Hữu Vinh',N'085790438',N'Tây Ninh',1),
(N'Lê Hữu Hằng',N'0890438',N'TP HCM',1),
(N'Nguyễn Phương Mai',N'0890438',N'Hà Nội',1),
(N'Hồ Thái Minh',N'0890438',N'Hải Dương',1),
(N'Mã Thanh Hằng',N'0890438',N'Tây Ninh',1),
(N'Hồ Thị Linh',N'085790438',N'Tây Ninh',1),
(N'Lê Thị Tấm',N'0890438',N'TP HCM',1),
(N'Nguyễn Phương Bình',N'0890438',N'Hà Nội',1),
(N'Hồ Thái Liên',N'0890438',N'Hải Dương',1),
(N'Mã Bảng Nhân',N'0890438',N'Tây Ninh',1),
(N'Hồ Thái Lan',N'085790438',N'Tây Ninh',1),
(N'Lê Mã Lang',N'0890438',N'TP HCM',1),
(N'Nguyễn Phong ',N'0890438',N'Hà Nội',1),
(N'Hồ Đại Chung',N'0890438',N'Hải Dương',1)

INSERT INTO QUANLY
VALUES('admin',N'12345',N'Nguyễn Nguyên Khang',N'394582','TPHCM'),
('caog123',N'12345',N'Cao Gia Huy',N'4564324',N'Hà Nội'),
('huong123',N'12345',N'Lê Văn Hường',N'34524523',N'Tây Ninh')

INSERT INTO MUONTRA
VALUES(1,2,N'21/08/2020','02/01/2021'),
(1,1,N'12/01/2021',NULL),
(1,3,N'21/07/2017',NULL),
(2,2,N'13/04/2021','02/08/2021'),
(2,1,N'23/12/2020',NULL),
(3,3,N'02/08/2021',NULL),
(5,2,N'22/10/2020','02/01/2020'),
(5,1,N'23/09/2020',NULL),
(5,3,N'16/07/2021',NULL),
(7,2,N'17/12/2020','02/01/2021'),
(7,1,N'28/12/2019',NULL),
(6,3,N'12/09/2020',NULL),
(14,2,N'02/07/2020','02/01/2021'),
(20,1,N'12/09/2020',NULL),
(21,3,N'28/01/2020',NULL),
(21,2,N'22/03/2020','02/01/2020'),
(13,1,N'28/09/2021',NULL),
(15,3,N'22/09/2020',NULL),
(15,2,N'22/09/2029','02/01/2020'),
(18,1,N'22/09/2020',NULL),
(16,3,N'21/09/2020',NULL),
(13,2,N'26/09/2019','02/01/2020'),
(25,1,N'24/09/2020',NULL),
(12,3,N'12/09/2020',NULL),
(18,2,N'12/09/2020','02/01/2021'),
(16,1,N'22/09/2020',NULL),
(17,3,N'28/10/2020',NULL),
(23,2,N'22/09/2018','02/01/2020'),
(9,1,N'29/09/2020',NULL),
(9,2,N'12/09/2017','02/01/2020'),
(2,1,N'12/07/2020',NULL),
(22,3,N'22/09/2020',NULL),
(7,3,N'22/09/2020',NULL),
(12,3,N'22/10/2020',NULL),
(22,2,N'21/09/2016','02/01/2020'),
(15,1,N'22/09/2020',NULL),
(14,2,N'02/09/2020','02/01/2021'),
(22,1,N'12/09/2020',NULL),
(22,3,N'02/07/2020',NULL),
(19,3,N'07/09/2020',NULL),
(18,3,N'22/07/2020',NULL),
(18,2,N'22/01/2020','02/01/2021'),
(9,1,N'24/09/2020',NULL),
(6,2,N'12/09/2020','02/01/2021'),
(6,1,N'22/09/2020',NULL),
(1,3,N'27/08/2020',NULL),
(16,3,N'29/09/2020',NULL),
(18,3,N'02/09/2020',NULL),
(23,2,N'02/09/2020','02/01/2021'),
(14,1,N'22/09/2020',NULL),
(9,2,N'22/04/2020','02/01/2021'),
(16,1,N'12/09/2020',NULL),
(21,3,N'24/03/2020',NULL),
(7,3,N'21/03/2021',NULL)


INSERT INTO CTMUONTRA
VALUES(1,2,50000,N'SÁCH HỎNG'),
(1,9,NULL,NULL),
(2,25,NULL,NULL),
(2,6,50000,N'SÁCH HỎNG'),
(2,2,NULL,NULL),
(2,7,NULL,NULL),
(3,1,50000,N'SÁCH HỎNG'),
(3,2,NULL,NULL),
(3,8,NULL,NULL),
(4,7,50000,N'SÁCH HỎNG'),
(5,2,NULL,NULL),
(5,1,50000,N'SÁCH HỎNG'),
(5,4,NULL,NULL),
(6,14,50000,N'SÁCH HỎNG'),
(6,12,NULL,NULL),
(6,18,NULL,NULL),
(9,11,50000,N'SÁCH HỎNG'),
(9,21,NULL,NULL),
(9,1,NULL,NULL),
(9,10,50000,N'SÁCH HỎNG'),
(10,26,NULL,NULL),
(10,13,NULL,NULL),
(10,11,50000,N'SÁCH HỎNG'),
(11,2,NULL,NULL),
(11,1,NULL,NULL),
(11,16,50000,N'SÁCH HỎNG'),
(12,2,NULL,NULL),
(12,1,NULL,NULL),
(12,24,50000,N'SÁCH HỎNG'),
(13,2,NULL,NULL),
(13,16,NULL,NULL),
(13,14,50000,N'SÁCH HỎNG'),
(14,2,NULL,NULL),
(14,18,50000,N'SÁCH HỎNG'),
(14,21,NULL,NULL),
(15,1,NULL,NULL),
(16,19,50000,N'SÁCH HỎNG'),
(16,21,NULL,NULL),
(16,16,50000,N'SÁCH HỎNG'),
(16,20,NULL,NULL),
(17,17,NULL,NULL),
(17,11,NULL,NULL),
(17,12,NULL,NULL),
(18,1,NULL,NULL),
(18,19,NULL,NULL),
(18,20,50000,N'SÁCH HỎNG'),
(19,21,NULL,NULL),
(19,13,NULL,NULL),
(19,10,50000,N'SÁCH HỎNG'),
(20,2,NULL,NULL),
(21,4,NULL,NULL),
(21,16,50000,N'SÁCH HỎNG'),
(21,21,NULL,NULL),
(22,7,NULL,NULL),
(22,8,50000,N'SÁCH HỎNG'),
(22,9,NULL,NULL),
(23,11,NULL,NULL),
(23,12,50000,N'SÁCH HỎNG'),
(23,2,NULL,NULL),
(24,15,NULL,NULL),
(24,17,50000,N'SÁCH HỎNG'),
(25,22,NULL,NULL),
(25,18,NULL,NULL),
(25,30,50000,N'SÁCH HỎNG'),
(26,21,NULL,NULL),
(27,19,NULL,NULL),
(27,11,50000,N'SÁCH HỎNG'),
(27,21,NULL,NULL),
(28,1,NULL,NULL),
(28,10,50000,N'SÁCH HỎNG'),
(28,21,NULL,NULL),
(29,11,NULL,NULL),
(29,1,50000,N'SÁCH HỎNG'),
(29,26,NULL,NULL),
(30,17,NULL,NULL),
(30,18,50000,N'SÁCH HỎNG'),
(30,25,NULL,NULL),
(31,14,NULL,NULL),
(31,17,50000,N'SÁCH HỎNG'),
(31,21,NULL,NULL),
(32,1,NULL,NULL),
(33,15,50000,N'SÁCH HỎNG'),
(33,21,NULL,NULL),
(34,6,NULL,NULL),
(34,7,50000,N'SÁCH HỎNG'),
(34,2,NULL,NULL),
(35,5,NULL,NULL)
select*from MUONTRA
select*from SACH
select*from QUANLY
select*from TACGIA
select*from CTMUONTRA
select*from THELOAI
-----------------------TRIGGER-----------------------
-- trigger cập nhật số lượng sách còn lại khi thêm, xóa vào bảng CTMUONTRA
GO
CREATE TRIGGER CAPNHAT_SLSACH ON  CTMUONTRA
FOR INSERT,DELETE
AS
	DECLARE @mash INT
	IF EXISTS (SELECT MASH FROM DELETED)
		BEGIN 
			SET @mash=(select  MASH from deleted)
			UPDATE SACH
			SET CONLAI=CONLAI+1
			WHERE MASH=@mash
		END

	IF EXISTS (SELECT MASH FROM inserted)
		BEGIN
		SET @mash=(select  MASH from inserted)
				UPDATE SACH
				SET CONLAI=CONLAI-1
				WHERE MASH=@mash
		END

----trigger cập nhật số lượng sách còn lại khi UPDATE vào bảng MUONTRA
GO
CREATE TRIGGER CAPNHAT_SOSACH ON  MUONTRA
FOR insert,UPDATE,delete
AS
	DECLARE @mamt INT
	IF EXISTS (SELECT * FROM DELETED)
		BEGIN 
			SET @mamt=(select  MAMT from deleted)
			UPDATE SACH
			SET CONLAI=CONLAI+1
			WHERE SACH.MASH IN (SELECT MASH FROM CTMUONTRA WHERE CTMUONTRA.MAMT=@mamt)
		END

	IF EXISTS (SELECT * FROM inserted)
		BEGIN
			if(SELECT NGTRA FROM inserted) is not NULL
				BEGIN
				SET @mamt=(select  MAMT from inserted)
					UPDATE SACH
					SET CONLAI=CONLAI-1
					WHERE SACH.MASH IN (SELECT MASH FROM CTMUONTRA WHERE CTMUONTRA.MASH=@mamt)
				END
		END
	

--trigger cập nhật số lần mượn khi thêm vào bảng MUONTRA	
GO
CREATE TRIGGER CAPNHAT_SLMUON ON  MUONTRA
FOR INSERT
AS
	DECLARE @madg NVARCHAR(10)
	set @madg=(select MADG FROM inserted)
	UPDATE DOCGIA
	SET SLMUON=SLMUON+1
	WHERE MADG=@madg


---trigger ngày trả >= ngày mượn
GO
CREATE TRIGGER KT_NGAYMUONTRA  ON MUONTRA
FOR INSERT,UPDATE
AS
	DECLARE @mamt INT
	SET @mamt=(select MAMT FROM inserted)
	IF(SELECT NGTRA FROM inserted) IS NULL
		COMMIT TRAN

	ELSE	IF(SELECT NGMUON FROM MUONTRA WHERE MAMT=@mamt)<=(SELECT NGTRA FROM inserted)
		COMMIT TRAN
	ELSE
		BEGIN 
			PRINT N' NGÀY TRẢ PHẢI LỚN HƠN HOẶC BẰNG NGÀY MƯỢN'
			ROLLBACK TRAN
		END


----------CÁC RÀNG BUỘC KHÁC----------------------------------
----nếu không nhập thì ngày mượn mặc định là ngày hôm nay
go
ALTER TABLE MUONTRA
ADD CONSTRAINT KT_NGAYMUON DEFAULT GETDATE() FOR NGMUON


-----------------------PROC-------------------
---truyền vào mã Độc giả , xuất thông tin mượn sách
go
create proc ThongTin_MT @madg int
as
	select MUONTRA.MAMT,TENSH,NGMUON,NGTRA FROM SACH,MUONTRA,CTMUONTRA WHERE MUONTRA.MADG=@madg
	 AND CTMUONTRA.MASH=SACH.MASH AND CTMUONTRA.MAMT=MUONTRA.MAMT


exec ThongTin_MT 1

---Truyền vào Mã Mượn Trả, xuất tổng sách của Lần mượn đó, Tình Trạng,Độc Giả
go
create proc TongSach
as
SELECT MUONTRA.MAMT,TENDG,COUNT(MASH)AS SOSACH ,NGTRA 
FROM CTMUONTRA,MUONTRA,DOCGIA
where CTMUONTRA.MAMT=MUONTRA.MAMT and MUONTRA.MADG=DOCGIA.MADG 
GROUP BY MUONTRA.MAMT,TENDG,NGTRA


exec TongSach 


-----------------------FUNCTION---------------------------
go
CREATE FUNCTION THONGKE()
returns @bang table(tongDG int, tongSach int, tongSachDangMuon int, tongSachKho int, tongPM int, tongDangMuon int, tongDaTra int)
	as
		begin
			declare @tongdg int
			SET @tongDG = (SELECT COUNT(MADG) as TONGDG FROM DOCGIA )
			declare @tongSach int
			SET @tongSach= (SELECT COUNT(MASH) as TONGSACH FROM SACH)
			declare @tongSachDangMuon int
			SET @tongSachDangMuon= (SELECT COUNT(MASH) as TONGSACH FROM CTMUONTRA)
			declare @tongSachKho int
			SET @tongSachKho= (SELECT SUM(CONLAI) as CONLAI FROM SACH)
			
			declare @tongPM int
			SET @tongPM= (SELECT COUNT(MAMT) as TONGPM FROM MUONTRA)
			
			declare @tongDangMuon int
			SET @tongDangMuon= (SELECT COUNT(MAMT) as DANGMUON FROM MUONTRA WHERE NGTRA IS NULL)
			declare @tongDaTra int
			SET @tongDaTra= (SELECT COUNT(MAMT) as DATRA FROM MUONTRA WHERE NGTRA IS NOT NULL)
			insert into @bang values(@tongDG, @tongSach,  @tongSachDangMuon, @tongSachKho, @tongPM, @tongDangMuon, @tongDaTra)
			return
		end	
SELECT*FROM dbo.THONGKE()
go
CREATE PROC TONGTV
AS
	BEGIN
		select * from dbo.THONGKE()
	END

exec TONGTV
---------------CURSOR--------------------------
--CURSOR DUYỆT QUA TỪNG DÒNG TRONG BẢNG SÁCH, IN TÊN SÁCH TƯƠNG ỨNG

DECLARE CURSOR_TENSACH CURSOR
DYNAMIC
FOR SELECT TENSH FROM SACH
OPEN CURSOR_TENSACH
--DUYỆT CURSOR
DECLARE @TENSH NVARCHAR(50)
FETCH NEXT FROM CURSOR_TENSACH INTO @TENSH
WHILE(@@FETCH_STATUS=0)
	BEGIN
		PRINT @TENSH
		FETCH NEXT FROM CURSOR_TENSACH INTO @TENSH
	END
--ĐÓNG CUROR
CLOSE CURSOR_TENSACH
DEALLOCATE CURSOR_TENSACH

--CURSOR DUYỆT QUA TỪNG DÒNG TRONG BẢNG SÁCH, IN RA TÊN SÁCH VÀ TÁC GIẢ TƯƠNG ỨNG

DECLARE CURSOR_TGSACH CURSOR
DYNAMIC
FOR SELECT TENSH, TENTG FROM SACH,TACGIA WHERE SACH.MATG=TACGIA.MATG
OPEN CURSOR_TGSACH
--DUYỆT CURSOR
DECLARE @TENSH NVARCHAR(50), @TENTG NVARCHAR(50)
FETCH NEXT FROM CURSOR_TGSACH INTO @TENSH,@TENTG
WHILE(@@FETCH_STATUS=0)
	BEGIN
		PRINT @TENSH +'---'+@TENTG
		FETCH NEXT FROM CURSOR_TGSACH INTO @TENSH,@TENTG
	END
--ĐÓNG CUROR
CLOSE CURSOR_TGSACH
DEALLOCATE CURSOR_TGSACH
-------------------------------------------
select *from MUONTRA
select *from CTMUONTRA
SELECT*FROM MUONTRA
SELECT *FROM MUONTRA	
SELECT *FROM CTMUONTRA
SELECT *FROM SACH