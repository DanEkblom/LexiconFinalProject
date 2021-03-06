DELETE FROM tbl_audio;
INSERT INTO tbl_audio (id, artist, title, year, tracks, length, genre, recordlabel, language, mediatype, audioformat, barcode)
VALUES (1, 'Pink Floyd', 'The Endless River', 2014, 18, 90, 'Rock', 'Parlophone Records', 'English', 'CD', 'Stereo', '8-25646-21542-3'),
       (2, 'Queen', 'Innuendo', 1991, 12, 50, 'Rock', 'Parlophone Records', 'English', 'CD', 'Stereo', '0-077779-588725'),
       (3, 'Ghost', 'Meliora', 2015, 10, 43, 'Rock', 'Universal Music AB', 'English', 'CD', 'Stereo', '6-02547-33055-0'),
       (4, 'Prince', 'Art Official Age', 2014, 13, 57, 'Funk', 'Warner Bros. Records Inc.', 'English', 'CD', 'Stereo', '0-9362-49333-4'),
       (5, 'Rammstein', 'Rosenrot', 2005, 11, 49, 'Industrial', 'Universal Music GMBH', 'German', 'CD', 'Stereo', '0-602498-745885-3');



DELETE FROM tbl_book;
INSERT INTO tbl_book (id, author, title, year, pages, genre, language, publisher, mediatype, isbn)
VALUES (1, 'Jeanne Boyarsky, Scott Selikoff', 'Oracle Certified Associate Java SE 8 Programmer I Study Guide', 2015, 366, 'Educational', 'English', 'Sybex', 'Book', '978-1-118-95740-0'),
       (2, 'Kaj Johansson, Peter Lundberg, Robert Ryberg', 'Grafisk kokbok 2.0', 2001, 314, 'Educational', 'Svenska', 'Bokförlaget Arena', 'Book', '91-7843-161-1'),
       (3, 'Arthur C. Clarke', 'The Songs of Distant Earth', 1986, 313, 'Science Fiction', 'English', 'Del Rey Books', 'Book', '0-345-32240-1'),
       (4, 'William Gibson', 'Neuromancer', 1984, 297, 'Science Fiction', 'Svenska', 'Bokförlaget Pan Norstedts', 'Book', '91-1-902781-8'),
       (5, 'Stephen King', 'Under the Dome', 2009, 1072, 'Thriller', 'English', 'Gallery Books', 'Book', '978-1-439-14903-4');



DELETE FROM tbl_video;
INSERT INTO tbl_video (id, title, year, originaltitle, director, genre, length, mediatype, language, audioformat, videoformat, barcode)
VALUES (1, 'Blade Runner', 1982, 'Blade Runner', 'Ridley Scott', 'Science Fiction', 117, 'Blu-Ray', 'English', 'Surround', 'Full HD', '1-2345-6789-0'),
       (2, 'Tomb Raider', 2018, '', 'Roar Uthaug', 'Action', 120, 'Blu-Ray', 'English', 'Surround', 'Full HD', '0-1234-5678-9'),
       (3, 'Coco', 2017, '', 'Lee Unkrich', 'Animated', 100, 'DVD', 'English', 'Surround', 'DVD', '0-9876-5432-1'),
       (4, 'Das Boot', 1981, 'Das Boot', 'Wolfgang Petersen', 'Drama', 209, 'DVD', 'German', 'Stereo', 'DVD', '5-051162-347316'),
       (5, 'Passengers', 2016, '', 'Morten Tyldum', 'Adventure', 116, 'Blu-Ray', 'English', 'Surround', '4K Ultra HD', '7-330031-001107');