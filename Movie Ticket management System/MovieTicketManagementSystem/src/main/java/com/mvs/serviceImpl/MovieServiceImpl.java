package com.mvs.serviceImpl;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery.FetchableFluentQuery;
import org.springframework.stereotype.Service;

import com.mvs.entity.Movie;
import com.mvs.repository.MovieRepo;
import com.mvs.service.MovieService;
@Service
public class MovieServiceImpl implements MovieService {

	@Autowired
	private MovieRepo movieRepo;
//		@Override
//		public <S extends Movie> Optional<S> findOne(Example<S> example) {
//			// TODO Auto-generated method stub
//			return Optional.empty();
//		}
//		
//		@Override
//		public <S extends Movie, R> R findBy(Example<S> example, Function<FetchableFluentQuery<S>, R> queryFunction) {
//			// TODO Auto-generated method stub
//			return null;
//		}
//		
//		@Override
//		public <S extends Movie> Page<S> findAll(Example<S> example, Pageable pageable) {
//			// TODO Auto-generated method stub
//			return null;
//		}
//		
//		@Override
//		public <S extends Movie> boolean exists(Example<S> example) {
//			// TODO Auto-generated method stub
//			return false;
//		}
//		
//		@Override
//		public <S extends Movie> long count(Example<S> example) {
//			// TODO Auto-generated method stub
//			return 0;
//		}
//		
//		@Override
//		public <S extends Movie> S save(S entity) {
//			// TODO Auto-generated method stub
//			return null;
//		}
//		
//		@Override
//		public Optional<Movie> findById(String id) {
//			// TODO Auto-generated method stub
//			return Optional.empty();
//		}
//		
//		@Override
//		public boolean existsById(String id) {
//			// TODO Auto-generated method stub
//			return false;
//		}
//		
//		@Override
//		public void deleteById(String id) {
//			// TODO Auto-generated method stub
//			
//		}
//		
//		@Override
//		public void deleteAllById(Iterable<? extends String> ids) {
//			// TODO Auto-generated method stub
//			
//		}
//		
//		@Override
//		public void deleteAll(Iterable<? extends Movie> entities) {
//			// TODO Auto-generated method stub
//			
//		}
//		
//		@Override
//		public void deleteAll() {
//			// TODO Auto-generated method stub
//			
//		}
//		
//		@Override
//		public void delete(Movie entity) {
//			// TODO Auto-generated method stub
//			
//		}
//		
//		@Override
//		public long count() {
//			// TODO Auto-generated method stub
//			return 0;
//		}
//		
//		@Override
//		public Page<Movie> findAll(Pageable pageable) {
//			// TODO Auto-generated method stub
//			return null;
//		}
//		
//		@Override
//		public <S extends Movie> S saveAndFlush(S entity) {
//			// TODO Auto-generated method stub
//			return null;
//		}
//		
//		@Override
//		public <S extends Movie> List<S> saveAllAndFlush(Iterable<S> entities) {
//			// TODO Auto-generated method stub
//			return null;
//		}
//		
//		@Override
//		public <S extends Movie> List<S> saveAll(Iterable<S> entities) {
//			// TODO Auto-generated method stub
//			return null;
//		}
//		
//		@Override
//		public Movie getReferenceById(String id) {
//			// TODO Auto-generated method stub
//			return null;
//		}
//		
//		@Override
//		public Movie getOne(String id) {
//			// TODO Auto-generated method stub
//			return null;
//		}
//		
//		@Override
//		public Movie getById(String id) {
//			// TODO Auto-generated method stub
//			return null;
//		}
//		
//		@Override
//		public void flush() {
//			// TODO Auto-generated method stub
//			
//		}
//		
//		@Override
//		public List<Movie> findAllById(Iterable<String> ids) {
//			// TODO Auto-generated method stub
//			return null;
//		}
//		
//		@Override
//		public <S extends Movie> List<S> findAll(Example<S> example, Sort sort) {
//			// TODO Auto-generated method stub
//			return null;
//		}
//		
//		@Override
//		public <S extends Movie> List<S> findAll(Example<S> example) {
//			// TODO Auto-generated method stub
//			return null;
//		}
//		
//		@Override
//		public List<Movie> findAll(Sort sort) {
//			// TODO Auto-generated method stub
//			return null;
//		}
//		
//		@Override
//		public List<Movie> findAll() {
//			// TODO Auto-generated method stub
//			return null;
//		}
//		
//		@Override
//		public void deleteAllInBatch(Iterable<Movie> entities) {
//			// TODO Auto-generated method stub
//			
//		}
//		
//		@Override
//		public void deleteAllInBatch() {
//			// TODO Auto-generated method stub
//			
//		}
//		
//		@Override
//		public void deleteAllByIdInBatch(Iterable<String> ids) {
//			// TODO Auto-generated method stub
//			
//		}
//	};
//	
	public Movie saveMovie(Movie movie) {
		return movieRepo.save(movie);
	}
	public List<Movie> getMovies(){
		return movieRepo.findAll();
	}
	public Movie getMovieByName(String movieName) {
		return movieRepo.findById(movieName).orElse(null);
	}
	public Movie updateMovie(Movie movie) {
		Movie existingMovie=movieRepo.findById(movie.getMovieName()).orElse(null);
		existingMovie.setMovieName(movie.getMovieName());
		existingMovie.setMultiplex(movie.getMultiplex());
		existingMovie.setScreen(movie.getScreen());
		existingMovie.setSeatCount(movie.getSeatCount());
		existingMovie.setTime(movie.getTime());
		existingMovie.setTicketPrice(movie.getTicketPrice());
		return movieRepo.save(existingMovie);
	}
	public String deleteMovie(String movieName) {
		movieRepo.deleteById(movieName);
		return "Movie deleted with name : "+movieName;
	}
}
